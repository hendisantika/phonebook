TRUNCATE TABLE contact;
ALTER TABLE contact AUTO_INCREMENT = 1;

INSERT INTO contact (id, firstname, lastname, email, phonenumber) VALUES
(1, "Uzumaki", "Naruto", "uzumaki_naruto@konohagakure.com", "081321411551"),
(2, "Uchiha", "Sasuke", "uchiha_sasuke@konohagakure.com", "081321411552"),
(3, "Haruno", "Sakura", "haruno_sakura@konohagakure.com", "081321411553"),
(4, "Hatake", "Kakashi", "hatake_kakashi@konohagakure.com", "081321411554"),
(5, "Minato", "Namikaze", "minato_namikaze@konohagakure.com", "081321411555");