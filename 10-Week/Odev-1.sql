# film tablosunda bulunan tüm sütunlardaki verileri film uzunluğu (length) 60 dan büyük VE 75 ten küçük olma koşullarıyla sıralayınız.

select title,description from film
where length > 60 AND length < 75;

# film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99 VE replacement_cost 12.99 VEYA 28.99 olma koşullarıyla sıralayınız.

select * from film
where rental_rate = 0.99 AND (replacement_cost = 12.99 OR  replacement_cost = 28.99);

# customer tablosunda bulunan first_name sütunundaki değeri 'Mary' olan müşterinin last_name sütunundaki değeri nedir?

SELECT last_name FROM customer
where first_name = 'Mary';

# film tablosundaki uzunluğu(length) 50 ten büyük OLMAYIP aynı zamanda rental_rate değeri 2.99 veya 4.99 OLMAYAN verileri sıralayınız.

select rental_rate,length FROM film
Where NOT length > 50 AND NOT (rental_rate = 2.99 OR rental_rate = 4.99);
