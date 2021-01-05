# kata_test_android

![TDD](https://miro.medium.com/max/384/1*ieVWcSsJmeBbZFo6a_dL5g.png)

## Exercise 1

Write a function that returns true or false depending on whether its input integer is a leap year or not.

A leap year is defined as one that is divisible by 4, but is not otherwise divisible by 100 unless it is also divisible by 400.

For example, 2001 is a typical common year and 1996 is a typical leap year, whereas 1900 is an atypical common year and 2000 is an atypical leap year.

## Exercise 2

Your task is to write a function that takes two arguments, a string and an integer width.

The function returns the string, but with line breaks inserted at just the right places to make sure that no line is longer than the column number. You try to break lines at word boundaries.

Like a word processor, break the line by replacing the last space in a line with a newline.

## Exercise 3 

To try and encourage more sales of the 5 different Harry Potter books they sell, a bookshop has decided to offer discounts of multiple-book purchases.

One copy of any of the five books costs 8 EUR.

If, however, you buy two different books, you get a 5% discount on those two books.

If you buy 3 different books, you get a 10% discount.

If you buy 4 different books, you get a 20% discount.

If you go the whole hog, and buy all 5, you get a huge 25% discount.

Note that if you buy, say, four books, of which 3 are different titles, you get a 10% discount on the 3 that form part of a set, but the fourth book still costs 8 EUR.

Your mission is to write a piece of code to calculate the price of any conceivable shopping basket (containing only Harry Potter books), giving as big a discount as possible.

For example, how much does this basket of books cost?

2 copies of the first book
2 copies of the second book
2 copies of the third book
1 copy of the fourth book
1 copy of the fifth book

One way of group these 8 books is:
 1 group of 5 --> 25% discount (1st,2nd,3rd,4th,5th)
+1 group of 3 --> 10% discount (1st,2nd,3rd)
This would give a total of
 5 books at a 25% discount
+3 books at a 10% discount
Giving
 5 x (8 - 2.00) == 5 x 6.00 == 30.00
+3 x (8 - 0.80) == 3 x 7.20 == 21.60
For a total of 51.60

However, a different way to group these 8 books is:
 1 group of 4 books --> 20% discount  (1st,2nd,3rd,4th)
+1 group of 4 books --> 20% discount  (1st,2nd,3rd,5th)
This would give a total of
 4 books at a 20% discount
+4 books at a 20% discount
Giving
 4 x (8-1.60) == 4 x 6.40 == 25.60
+4 x (8-1.60) == 4 x 6.40 == 25.60
For a total of 51.20

And 51.20 is the price with the biggest discount.

     
