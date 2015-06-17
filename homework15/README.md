HOMEWORK #15

TASK 1
Napisati klasu koja opisuje jednu kasu. Kasasadrzi

    Atribut (private) koji opisuje ime, npr. "Moja kasa", "Za more", "Crni fond", itd.
    Atribut (private) koji opisuje trenutnu sumu novca u kasi
    Konstruktor koji inicijalizira ime objekta (ne i trenutnu sumu novca)
    Metoda koja dodaje novac u kasu, npr. dodaj 20 u kasu bi bilo addMoney(20)
    Metodakojavadisavnovacizkase,nprakojebilo20ondaepostati0
    Metoda koja ispisuje koliko novca ima ukasinasljedeinain
            o Ako nema nikako onda ispisuje "It is empty..."
            o koimaizmeu1i20ispisuje "There's some, but not much."
            o koimaizmeu21i100ispisuje"There's some."
            o koima101iliviseonda ispisuje "There's a lot."



 PRIMJER
 Safe s = new Safe(,,Crni fond");
 s.printInformation(); // Isprinta ,,It is empty..."

 s.addMoney(30);                   // Doda 30 KM u kasu
 s.printInformation(); // Isprinta ,,There's some."

 s.addMoney(100);
 s.printInformation(); // Isprinta ,,There's a lot."

 s.clear();                        // Isprazni sef/kasu
 s.printInformation(); // Isprinta ,,It is empty..."

TASK 2
Napisati klasu koja opisuje jednu zivotinju. Zivotinju opisujusljedeiatributi

      Atribut (private)kojiopisujeimezivotinje
      Atribut (private) koji opisuje dalijezivotinjaaktivnadanjuilinou
              o Vrijednost1znaidajezivotinjaaktivnadanju
              o Vrijednost2znaidajezivotinjaaktivnanou
      Atribut (private)kojiopisujekolikojezivotinjipotrebnovode
              o Vrijednost1znaidajezivotinjipotrebnomalovode
              o Vrijednost 2 znaidaje zivotinjipotrebnovisevode
              o Vrijednost3znaidajezivotinjipotrebno mnogo vode
      Napraviti konstruktor koji inicijalizira ta tri atributa

Poredtoga,svetezivotinjedijele isto stanisteStanisteje potrebno predstaviti u istoj klasikaoizivotinje,
tj. bez koristenjadodatnihklasaTostanistejeopisanosadvijevarijable

      Dalijenoilidan (private) koje je po default-u 1
              o Vrijednost1znaidajedan
              o Vrijednost2znaidajeno
      Kolikovodeimastaniste (private) koje je po default-u 1
              o Vrijednost0znaidastanistenemavode
              o Vrijednost1znaidastanisteposjedujemalo vode
              o Vrijednost 2 znaida staniste posjeduje visevode
              o Vrijednost3znaida stanisteposjeduje mnogo vode

Zivotinjeimajusamojednumetodu

      Isprintatikakvojetrenutnostanjezivotinje
              o Ukolikodobadanaodgovarazivotinjii ona ima dovoljno vode za sebe
                      Isprintati "It's fine. The animal is active and has water."
              o Ukoliko doba dana odgovara, ali nema dovoljno vode
                      Isprintati "The animal is active, but does not have enough water."
              o Ukoliko doba dana ne odgovara, ali ima dovoljno vode
                      Isprintati "The animal is not active, but has enough water."
              o Ukoliko doba dana ne odgovara, niti ima dovoljno vode
                      Isprintati "The animal is not active and it does not have enough water."

Postoji josjednametodakojautienastaniste

      Promijeni doba dana
              o kojebilano onda postaje dan (nakon poziva metode)
              o Ako je bio dan onda postaje no(nakonpozivametode)
      Promijeni koliko vode trenutno ima (static set metoda)

PRIMJER
Animal a1 = new Animal(,,Animal 1", 1, 1);
Animal a2 = new Animal(,,Animal 2", 2, 3);

// ,,It's fine. The animal is active and has water."
a1.printStatus();

// "The animal is not active and it does not have enough water."
a2.printStatus();


Animal.cycleDayNight(); // Dan prelazi u no
Animal.setAmountOfWater(3); // Sada vrijednost vode prelazi na 3

// "The animal is not active, but has enough water."
a1.printStatus();

// "It's fine. The animal is active and has water."
a2.printStatus();

