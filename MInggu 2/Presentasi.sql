-- mengambil data dari 1 tabel
SELECT * FROM students;

-- mengambil data student yang gender nya Female atau F,
-- Kemudian kelahiran nya lebih dari sama dengan tahun 200
-- dan mempunyai poin lebih dari 700
select * from students where gender = 'F' and birthday >= '2000-01-01' and point > 700; 



-- Mengambil data buku yang mempunyai lebih dari 350 halaman 
-- dan lihat semua detail property dari buku, kemudian tampilkan 
-- juga berapa kali buku tersebut pernah dipinjam.
SELECT *, (
  SELECT count (*) FROM borrows br WHERE br.bookId = book.bookId
  ) AS borrowCount,
  auth.name AS author,
  typ.name AS type
FROM books book
	  LEFT JOIN types typ ON book.typeId = typ.typeId
	  LEFT JOIN authors auth ON book.authorId = auth.authorId
WHERE book.pagecount > 350
ORDER BY book.pagecount DESC; 
  