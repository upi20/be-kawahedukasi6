package TugasMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 3. Map
        // a. employees
        Map<String, Object> employees = new HashMap();

        employees.put("employees", (new ArrayList<>(List.of(
                (new HashMap<String, String>(){{
                    put("name", "Shyam");
                    put("email", "shyamjaiswal@gmail.com");
                }}),
                (new HashMap<String, String>(){{
                    put("name", "Bob");
                    put("email", "bob32@gmail.com");
                }}),
                (new HashMap<String, String>(){{
                    put("name", "Jai");
                    put("email", "jai87@gmail.com");
                }})

        ))));
        System.out.println(employees);
        // output: {employees=[{name=Shyam, email=shyamjaiswal@gmail.com}, {name=Bob, email=bob32@gmail.com}, {name=Jai, email=jai87@gmail.com}]}

        // b. menu
        Map<String, Object> menuData = new HashMap<>();
        menuData.put("id", "file");
        menuData.put("value","File");

        Map<String, Object> menuItem = new HashMap<>();
        menuItem.put("menuitem", (new ArrayList<>(List.of(
                (new HashMap<String, String>(){{
                    put("value", "New");
                    put("onclick", "CreateDoc()");
                }}),
                (new HashMap<String, String>(){{
                    put("value", "Open");
                    put("onclick", "OpenDoc()");
                }}),
                (new HashMap<String, String>(){{
                    put("value", "Save");
                    put("onclick", "SaveDoc()");
                }})

        ))));

        menuData.put("popup",menuItem);

        Map<String, Object> menu = new HashMap<>();
        menu.put("menu",menuData);
        System.out.println(menu);
        // output: {menu={popup={menuitem=[{onclick=CreateDoc(), value=New}, {onclick=OpenDoc(), value=Open}, {onclick=SaveDoc(), value=Save}]}, id=file, value=File}}

        // c. widget
        Map<String, Object> widgetData = new HashMap<>();
        widgetData.put("debug", "on");

        // widget window
        Map<String, Object> widgetWindow = new HashMap<>();
        widgetWindow.put("title", "Sample Konfabulator Widget");
        widgetWindow.put("name", "main_window");
        widgetWindow.put("width", 500);
        widgetWindow.put("height", 500);
        widgetData.put("window", widgetWindow);

        // widget image
        Map<String, Object> widgetImage = new HashMap<>();
        widgetImage.put("src", "Images/Sun.png");
        widgetImage.put("name", "sun1");
        widgetImage.put("hOffset", 250);
        widgetImage.put("vOffset", 250);
        widgetImage.put("alignment", "center");
        widgetData.put("image", widgetImage);

        // widget text
        Map<String, Object> widgetText = new HashMap<>();
        widgetText.put("data", "Click Here");
        widgetText.put("size", 36);
        widgetText.put("style", "bold");
        widgetText.put("name", "text1");
        widgetText.put("hOffset", 250);
        widgetText.put("vOffset", 100);
        widgetText.put("alignment", "center");
        widgetText.put("onMouseUp", "sun1.opacity = (sun1.opacity / 100) * 90;");
        widgetData.put("text", widgetText);

        Map<String, Object> widget = new HashMap<>();
        widget.put("widget",widgetData);
        System.out.println(widget);
        // output: {widget={image={vOffset=250, src=Images/Sun.png, name=sun1, alignment=center, hOffset=250}, debug=on, window={name=main_window, width=500, title=Sample Konfabulator Widget, height=500}, text={vOffset=100, data=Click Here, size=36, name=text1, style=bold, alignment=center, onMouseUp=sun1.opacity = (sun1.opacity / 100) * 90;, hOffset=250}}}
    }
}
