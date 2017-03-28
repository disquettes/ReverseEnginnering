Analiza GRASP
=============

In acest document, vom identifica corectitudinea claselor si vom
analiza complexitatea lor in vederea stabilirii gradului de cuplaj si de
coeziune a fiecareia.

Sunt urmarite obiective ca a avea un design modular si pentru acest lucru
avem nevoie de un cuplaj slab si o coeziune puternica. In urma analizei,
vom incerca a modifica structura actuala pentru a realiza obiectivele
in cauza

Structura
---------

- PAYMENT: clasa de baza pentru a deriva in CASH, CREDIT
- ORDER: foloseste Singleton pe ORDERMANAGER
- ORDERMANAGER: implementeaza Singleton si poate verifica statusul unui
    Table

Cuplaj
------

Cuplaj mic, deoarece fiecare clasa este responsabila de propriile obiecte si
nu apeleaza metode din alte instance, in general. O mica exceptie, necesara,
exista in clasa ORDER deoarece la instantiere, avem nevoie de o instanta
unica de ORDERMANAGER.

- ORDERMANAGER este in stransa legatura cu ORDER si Table si vom avea in vedere
pe viitor sa minizam aceste legaturi stranse.

Coeziune
--------

Coeziunea este mare, deoarece fiecare metoda face ceea ce trebuie sa faca si
nu face prea multe lucruri, ci doar cele strict necesare si in directa
legatura, strans legate intre ele.

- De finalizat implementari in celelalte metode non-abstracte.
