# Hier die Uebungsaufgaben von Prog1 WiSe24
### hope they help ^^

# 1. Schulnoten
  ### Schreiben Sie ein Programm mit folgenden Komponenten:
 
main-Methode
Klassen-
bezeichnung 	     	Schulnoten
		
Aufgabe 	     	1. Initialisieren Sie ein Array mit den Bedeutungen der Schulnoten in folgender Reihenfolge:

        sehr gut
        gut
        befriedigend
        ausreichend
        ungenügend
        mangelhaft


2. Lesen Sie eine Zahl ein, die zwischen 1 und 6 (einschließlich) liegt.  

3.  Rufen Sie die folgenden Methoden auf.
Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(String schulnoten[])
   		
Aufgabe 	     	
Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife alle Schulnoten auf der Konsole aus.
    		
Ausgabe-
format 		


sehr gut
gut
...

    		
Hinweis 		Bitte schreiben Sie Umlaute als ue, ae, und oe.
Überladene Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(String schulnoten[], int zahl)
    		
Aufgabe 	     	
Die Methode hat das Array und eine ganze Zahl als Parameter. Die Zahl wird als Schulnote interpretiert (1 steht für sehr gut, 2 für gut, … 6 für mangelhaft). Die Methode gibt die entsprechende Schulnote des Arrays auf der Konsole aus.
    		
Hinweis 		Bitte beachten Sie die vorgegebene Reihenfolge der Parameter beim Programmieren.
    		
Hinweis 		Bitte schreiben Sie Umlaute als ue, ae und oe.

# 2. Sortieren von ganzen Zahlen
  ### Schreiben Sie ein Programm mit folgenden Komponenten:
Testtreiber
Bezeichnung 	     	SortierenGanzeZahlenTesttreiber
		
Aufgabe 	     	1. Initialisieren Sie ein Array für n ganze Zahlen, wobei Sie n einlesen.

2. Befüllen Sie das Array mit zufälligen Zahlen im Wertebereich von 0 bis 2147483647 (ausschließlich).
Nutzen Sie dafür den Zufallszahlengenerator der Klasse Math
.

3. Rufen Sie die folgenden Methoden der Klasse  SortierenGanzeZahlen 
auf.
Implementieren Sie in der Klasse  SortierenGanzeZahlen 
folgende Methoden:
Methode zum Sortieren
Methoden-
kopf 	     	public static void sortieren(int zahlen[])
   		
Aufgabe 	     	
Sortieren Sie die ganzen Zahlen, wobei Sie den Sortieralgorithmus der Klasse Arrays
 einsetzen können oder einen eigenen Sortieralgorithmus schreiben (letzteres ist schwieriger!).


Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(int zahlen[])
    		
Aufgabe 	     	
Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife die sortierten ganzen Zahlen wieder auf der Konsole aus.
Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.
	     	
Hinweis 	     	Sollten Sie mit der Scanner-Klasse arbeiten,
instanziieren Sie Ihren Scanner bitte ganz zu Beginn Ihrer Methode.

# 3. Zimmertemperatur
  ### Schreiben Sie ein Programm mit folgenden Komponenten:

Implementieren Sie in der Klasse  Zimmertemperatur 

folgende Methoden:
Methode zum Einlesen
Methoden-
kopf 	     	public static void einlesenTemperatur(int temperaturen[])
   		
Aufgabe 	     	Die Methode liest Zimmertemperaturen mit ganzzahligen, realistischen Werten ein (d.h. zwischen 15 und 30 Grad, Randwerte einschließlich ). Die Werte werden solange eingegeben bis -1  eingegeben wird oder das Array voll ist.
Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(int temperaturen[])
    		
Aufgabe 	     	
Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife die Zimmertemperaturen wieder auf der Konsole aus, wobei nur die eingelesenen Werte ausgegeben werden sollen.
    		
Ausgabe-
format 		


Temperatur: X

 Grad
Temperatur: Y

 Grad
Temperatur: Z

 Grad
...

Testtreiber
Bezeichnung 	     	ZimmertemperaturTesttreiber
		
Aufgabe 	     	Testen der oben aufgeführten Methoden (mithilfe der main-Methode).
Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.
	     	
Hinweis 	     	Sollten Sie mit der Scanner-Klasse arbeiten,
instanziieren Sie Ihren Scanner bitte ganz zu Beginn Ihrer Methode.



* Ihr Programm darf nicht abstürzen, wenn keine Zimmertemperaturen übergeben werden.
# 4. Binäres 2-Dim Array1
  ### Schreiben Sie ein Programm mit folgenden Komponenten:
Testtreiber
Klassen-
bezeichnung 	     	BinaerArrayITesttreiber
		
Aufgabe 	         	1. Initialisieren Sie ein zweidimensionales Array mit n Zeilen und n Spalten, wobei Sie n einlesen, zufällig mit Nullen und Einsen.
Nutzen Sie hierfür den Zufallszahlengenerator der Klasse Math

2. Rufen Sie die folgende Methode der Klasse BinaerArrayI auf.
 
Implementieren Sie in der Klasse BinaerArrayI folgende Methode:
Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(int matrix[][])
   		
Aufgabe 	     	
Geben Sie in dieser Methode die Zeilen des als Parameter übergebenen Arrays auf der Konsole aus, die mehr Einsen als Nullen enthalten. Geben Sie für diese auch die Nummer der Zeile im Array mit aus.
    		
Ausgabe-
format 		

					
Zeile X

: [WertederZeileX]


					
Zeile Y

: [WertederZeileY]


					
Zeile Z

: [WertederZeileZ]


					
...

Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.
	     	
Hinweis 	     	Sollten Sie mit der Scanner-Klasse arbeiten,
instanziieren Sie Ihren Scanner bitte ganz zu Beginn Ihrer Methode.



* Das Ausführen der Methode darf nicht zu einem Programmabsturz führen, wenn keine Zahlen übergeben werden.

  # 5. Zwei Dim Array Zeilenweise
    ### Schreiben Sie ein Programm mit folgenden Komponenten:
main-Methode
Klassen-
bezeichnung 	     	ZweidimArrayReihenweise
		
Aufgabe 	         	1. Deklarieren Sie ein 2-dim Array und reservieren Sie Speicher für 10 x 10 ganze Zahlen.

2. Rufen Sie zuerst die Methode zum Initialisieren und dann zum Ausgeben auf.
Methode zum Initialisieren
Methoden-
kopf 	     	public static void ini(int zahlen[][])
   		
Aufgabe 	         	Initialisieren Sie ein 2-dim Array, so dass die Zahlen 0 – 9 in der ersten Reihe, die Zahlen 10 – 19 in der zweiten Reihe, … und die Zahlen 90 – 99 in der zehnten Reihe stehen.
Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(int zahlen[][])
   		
Aufgabe 	     	
Geben Sie in dieser Methode mit Hilfe von for-Schleifen das initialisierte Array reiehnweise auf der Konsole aus. Die Elemente einer Reihe sollen jeweils durch einen Tabulatorsprung (Escape-Sequenz für Tabulatorsprung einsetzen) getrennt sein.
Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.



* Das Ausführen der Methode darf nicht zu einem Programmabsturz führen, wenn keine Zahlen übergeben werden.

# 6. GPSEntfernungen
  ### ================================

Formel: Entfernungsberechnung

Entfernung = Laufzeit * Lichtgeschwindigkeit 

Lichtgeschwindigkeit in m/s: 299792458

================================
Schreiben Sie ein Programm mit folgenden Komponenten:
Testtreiber
Bezeichnung 	     	GPSEntfernungenTesttreiber
		
Aufgabe 	     	1. Lesen Sie n für die Anzahl der Laufzeiten/Entfernungen ein.

2. Initialisieren Sie ein Array mit n zufälligen Laufzeiten größer 80 Millisekunden.
Nutzen Sie hierbei den Zufallszahlengenerator der Klasse Math.

3. Rufen Sie die folgenden Methoden der Klasse GPSEntfernungen auf.
Implementieren Sie in der Klasse GPSEntfernungen folgende Methoden:

Methode zum Berechnen*
Methoden-
kopf 	     	public static void berechneEntfernungen(int laufzeiten[], double entfernungen[])
   		
Aufgabe 	     	
Berechnung der Entfernungen aufgrund der zufälligen Laufzeiten in Kilometern mit Nachkommastellen (siehe Formel).
    		
Hinweis 		Bitte beachten Sie die vorgegebene Reihenfolge der Parameter beim Programmieren.


Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(double entfernungen[])
    		
Aufgabe 	     	
Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife die Entfernungen wieder auf der Konsole aus.
    		
Ausgabe-
format 		


Entfernung: X

 km
Entfernung: Y

 km
Entfernung: Z

 km
...

Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.
	     	
Hinweis 	     	Sollten Sie mit der Scanner-Klasse arbeiten,
instanziieren Sie Ihren Scanner bitte ganz zu Beginn Ihrer Methode.
* Das Ausführen der Methode darf nicht zu einem Programmabsturz führen, wenn keine Entfernungen und/oder Laufzeiten übergeben werden.

# 7. Wochentage 
  ### Schreiben Sie ein Programm mit folgenden Komponenten:
 
main-Methode
Klassen-
bezeichnung 	     	Wochentage
		
Aufgabe 	     	1. Initialisieren Sie ein Array mit den Wochentagen in folgender Reihenfolge:

        Montag
        Dienstag
        Mittwoch
        Donnerstag
        Freitag
        Samstag
        Sonntag

2. Lesen Sie eine Zahl ein, die zwischen 1 und 7 (einschließlich) liegt.  

3.  Rufen Sie die folgenden Methoden auf.
Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(String wochentage[])
   		
Aufgabe 	     	
Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife alle Wochentage auf der Konsole aus.
    		
Ausgabe-
format 		


Montag
Dienstag
...

Überladene Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(String wochentage[], int zahl)
    		
Aufgabe 	     	
Die Methode hat die Wochentage und eine ganze Zahl als  Parameter.  Die Zahl wird als Wochentag interpretiert (1 steht für Montag, 2 für Dienstag, … 7 für Sonntag). Die Methode gibt den entsprechenden Wochentag des Arrays auf der Konsole aus.
    		
Hinweis 		Bitte beachten Sie die vorgegebene Reihenfolge der Parameter beim Programmieren.
Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.
	     	
Hinweis 	     	Sollten Sie mit der Scanner-Klasse arbeiten,
instanziieren Sie Ihren Scanner bitte ganz zu Beginn Ihrer Methode.
* Das Ausführen der Methode darf nicht zu einem Programmabsturz führen, wenn keine Wochentage übergeben werden.

# 8. Celsius2Fahrenheit
  ### Schreiben Sie ein Programm mit folgenden Komponenten:
Testtreiber
Bezeichnung 	     	Celsius2FahrenheitTesttreiber
		
Aufgabe 	     	1. Lesen Sie n für die Anzahl der Celsius-Werte ein.

2. Initialisieren Sie ein Array mit n zufälligen Celsius-Werten größer 0 und kleiner 100 Grad.
Nutzen Sie hierbei den Zufallszahlengenerator der Klasse Math.

3. Rufen Sie die folgenden Methoden der Klasse Celsius2Fahrenheit auf.

Implementieren Sie in der Klasse Celsius2Fahrenheit folgende Methoden:
Methode zum Berechnen*
Methoden-
kopf 	     	public static void berechneCelsius2Fahrenheit(int celsius[], double fahrenheit[])
   		
Aufgabe 	     	
Berechnung der Fahrenheit-Werte aus den zufälligen Celsius-Werten mit Nachkommastellen, wobei:
1 Fahrenheit = 1,8 * Celsius + 32
    		
Hinweis 		Bitte beachten Sie die vorgegebene Reihenfolge der Parameter beim Programmieren.


Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(double fahrenheit[])
    		
Aufgabe 	     	
Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife die Fahrenheit-Werte wieder auf der Konsole aus.
    		
Ausgabe-
format 		


Fahrenheit: X


Fahrenheit: Y


Fahrenheit: Z


...

Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.
	     	
Hinweis 	     	Sollten Sie mit der Scanner-Klasse arbeiten,
instanziieren Sie Ihren Scanner bitte ganz zu Beginn Ihrer Methode.

* Das Ausführen der Methode darf nicht zu einem Programmabsturz führen, wenn keine Fahrenheit-Werte und/oder Celsius-Werte übergeben werden.

# 9. PS2KW
  ### Schreiben Sie ein Programm mit folgenden Komponenten:
Testtreiber
Bezeichnung 	     	PS2KWTesttreiber
		
Aufgabe 	     	1. Lesen Sie n für die Anzahl der PS-Werte ein.

2. Initialisieren Sie ein Array mit n zufälligen PS-Werten größer 0 PS und kleiner 500 PS.
Nutzen Sie hierbei den Zufallszahlengenerator der Klasse Math
.

3. Rufen Sie die folgenden Methoden der Klasse  PS2KW 
auf.

Implementieren Sie in der Klasse  PS2KW 

folgende Methoden:
Methode zum Berechnen*
Methoden-
kopf 	     	public static void berechnePS2KW(int ps[], double kw[])
   		
Aufgabe 	     	
Berechnung der kW-Werte aus den zufälligen PS-Werten, wobei:
1PS=0,73549875kW
    		
Hinweis 		Bitte beachten Sie die vorgegebene Reihenfolge der Parameter beim Programmieren.


Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(double kw[])
    		
Aufgabe 	     	
Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife die kW-Werte wieder auf der Konsole aus.
    		
Ausgabe-
format 		


kW: X


kW: Y


kW: Z


...

Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.
	     	
Hinweis 	     	Sollten Sie mit der Scanner-Klasse arbeiten,
instanziieren Sie Ihren Scanner bitte ganz zu Beginn Ihrer Methode.

* Das Ausführen der Methode darf nicht zu einem Programmabsturz führen, wenn keine PS-Werte und/oder kW Werte übergeben werden.

# 10. Monate
  ### Schreiben Sie ein Programm mit folgenden Komponenten:
 
main-Methode
Klassen-
bezeichnung 	     	Monate
		
Aufgabe 	     	1. Initialisieren Sie ein Array mit den Monaten in der Reihenfolge von Januar bis Dezember.

2. Lesen Sie  eine Zahl ein, die zwischen 1 und 12 (einschließlich) liegt.  

3.  Rufen Sie die folgenden Methoden auf.
    		
Hinweis 		Bitte schreiben Sie Umlaute als ue, ae, und oe.
Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(String monate[])
   		
Aufgabe 	     	
Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife alle Monate auf der Konsole aus.
    		
Ausgabe-
format 		


Januar
Februar
...

    		
Hinweis 		Bitte schreiben Sie Umlaute als ue, ae, und oe.
Überladene Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(String monate[], int zahl)
    		
Aufgabe 	     	
Die Methode hat die Monate und eine ganze Zahl als Parameter. Die Zahl wird als Monat interpretiert (1 steht für Januar, 2 für Februar, … 12 für Dezember). Die Methode gibt den entsprechenden Monat des Arrays auf der Konsole aus.
    		
Hinweis 		Bitte beachten Sie die vorgegebene Reihenfolge der Parameter beim Programmieren.
    		
Hinweis 		Bitte schreiben Sie Umlaute als ue, ae, und oe.
Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.
	     	
Hinweis 	     	Sollten Sie mit der Scanner-Klasse arbeiten,
instanziieren Sie Ihren Scanner bitte ganz zu Beginn Ihrer Methode.
* Das Ausführen der Methode darf nicht zu einem Programmabsturz führen, wenn keine Monate übergeben werden.

# 11. Klausur
  ### Schreiben Sie ein Programm mit folgenden Komponenten:
Testtreiber
Bezeichnung 	     	KlausurTesttreiber
		
Aufgabe 	         	1. Initialisieren Sie zwei Arrays für n ganze Zahlen (wobei Sie n einlesen)

2. Befüllen Sie die Arrays zufällig mit Zahlen zwischen...
- 0 und 10 (Array1)
- 0 und 100 (Array2)
Nutzen Sie hierfür den Zufallszahlengenerator der Klasse Math.

3. Rufen Sie die folgende Methode der Klasse Klausur auf.


Implementieren Sie in der Klasse Klausur folgende Methode:
Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(int array1[], int array2[])
   		
Aufgabe 	     	
1. Geben Sie in dieser Methode alle Zahlen i auf der Konsole aus für die "bestanden" gilt:
Array1[i] + Array2[i] > 49
2. Geben Sie die Gesamtanzahl der Kandidaten aus, die "bestanden" haben.
    		
Ausgabe-
format 		

Array1: X Array2: Y ist gleich S

Array1: X Array2: Y ist gleich S

                
...

Es haben Z

 Teilnehmer bestanden.

Hinweis 		S im Ausgabeformat steht für Summe.
Hinweis 		Bitte beachten Sie die vorgegebene Reihenfolge der Parameter beim Programmieren.
Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.
	     	
Hinweis 	     	Sollten Sie mit der Scanner-Klasse arbeiten,
instanziieren Sie Ihren Scanner bitte ganz zu Beginn Ihrer Methode.


* Das Ausführen der Methode darf nicht zu einem Programmabsturz führen, wenn keine Zahlen übergeben werden.

# 12. 2 Dim Array Spaltenweise
  ### Schreiben Sie ein Programm mit folgenden Komponenten:
main-Methode
Klassen-
bezeichnung 	     	ZweidimArraySpaltenweise
		
Aufgabe 	         	1. Deklarieren Sie ein 2-dim Array und reservieren Sie Speicher für 10 x 10 ganze Zahlen.

2. Rufen Sie zuerst die Methode zum Initialisieren und dann zum Ausgeben auf.
Methode zum Initialisieren
Methoden-
kopf 	     	public static void ini(int zahlen[][])
   		
Aufgabe 	         	Initialisieren Sie ein 2-dim Array, so dass die Zahlen 0 – 9 in der ersten Reihe, die Zahlen 10 – 19 in der zweiten Reihe, … und die Zahlen 90 – 99 in der zehnten Reihe stehen.
Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(int zahlen[][])
   		
Aufgabe 	     	
Geben Sie in dieser Methode mit Hilfe von for-Schleifen das initialisierte Array spaltenweise auf der Konsole aus. Die Elemente einer Spalte sollen jeweils durch einen Tabulatorsprung (Escape-Sequenz für Tabulatorsprung einsetzen) getrennt sein.
Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.



* Das Ausführen der Methode darf nicht zu einem Programmabsturz führen, wenn keine Zahlen übergeben werden.

# 13. Binär Array2
  ### Schreiben Sie ein Programm mit folgenden Komponenten:
Testtreiber
Klassen-
bezeichnung 	     	BinaerArrayIITesttreiber
		
Aufgabe 	         	1. Initialisieren Sie ein zweidimensionales Array mit n Zeilen und n Spalten, wobei Sie n einlesen, zufällig mit Nullen und Einsen.
Nutzen Sie hierfür den Zufallszahlengenerator der Klasse Math
.

2. Rufen Sie die folgende Methode der Klasse  BinaerArrayII 
auf.
Implementieren Sie in der Klasse  BinaerArrayII 
folgende Methode:
Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(int matrix[][])
   		
Aufgabe 	     	
Geben Sie in dieser Methode die Zeilen des als Parameter übergebenen Arrays auf der Konsole aus, die eine gerade Anzahl von Nullen enthalten. Geben Sie für diese auch die Nummer der Zeile im Array mit aus.
    		
Ausgabe-
format 		


Zeile X

: [WertederZeileX]


Zeile Y

: [WertederZeileY]


Zeile Z

: [WertederZeileZ]


...

Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.
	     	
Hinweis 	     	Sollten Sie mit der Scanner-Klasse arbeiten,
instanziieren Sie Ihren Scanner bitte ganz zu Beginn Ihrer Methode.



* Das Ausführen der Methode darf nicht zu einem Programmabsturz führen, wenn keine Zahlen übergeben werden.

# 14. GPSEmpfang
  ### Schreiben Sie ein Programm mit folgenden Komponenten:

Implementieren Sie in der Klasse GPSEmpfang folgende Methoden:
Methode zum Einlesen
Methoden-
kopf 	     	public static void einlesenLaufzeiten(int laufzeiten[])
   		
Aufgabe 	     	Die Methode liest Laufzeiten für eine GPS-Messung mit realistischen Werten ein (d.h. zwischen 80 und 130 Millisekunden, einschließlich Randwerte).
Die Werte werden solange eingegeben bis -1 eingegeben wird, oder das Array voll ist.


Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(int laufzeiten[])
    		
Aufgabe 	     	
Geben Sie in dieser Methode mit Hilfe einer for-Schleife 
die Laufzeiten wieder auf der Konsole aus, 
wobei nur die eingelesenen Werte ausgegeben werden sollen.
    		
Ausgabe-
format 		


Laufzeit: X

 ms
Laufzeit: Y

 ms
Laufzeit: Z

 ms
...

Testtreiber
Bezeichnung 	     	GPSEmpfangTesttreiber
		
Aufgabe 	     	Aufrufen der oben aufgeführten Methoden (mithilfe der main-Methode).
Geben Sie in den Parameterlisten ein Array mit Testwerten an.
Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.
	     	
Hinweis 	     	Sollten Sie mit der Scanner-Klasse arbeiten,
instanziieren Sie Ihren Scanner bitte ganz zu Beginn Ihrer Methode.

*Das Ausführen der Methode darf nicht zu einem Programmabsturz führen, wenn keine Laufzeiten übergeben werden.

# 15. Lottozahlen Sortieren
  ### Schreiben Sie ein Programm mit folgenden Komponenten:
 
main-Methode
Klassen-
bezeichnung 	     	LottozahlenSortieren
		
Aufgabe 	     	1. Initialisieren Sie ein Array für 6 ganze, zufällige Zahlen im Wertebereich von 1 bis 49 (einschließlich) (Zahlen dürfen mehrfach vorkommen).
Nutzen Sie hierfür den Zufallszahlengenerator der Klasse Math

2. Rufen Sie die folgenden Methoden auf.
Methode zum Sortieren
Methoden-
kopf 	     	public static void sortieren(int lottozahlen[])
   		
Aufgabe 	     	
Sortieren Sie die ganzen Zahlen, wobei Sie den Sortieralgorithmus der Klasse Arrays einsetzen können oder einen eigenen Sortieralgorithmus schreiben (letzteres ist schwieriger!)


Methode zum Ausgeben*
Methoden-
kopf 	     	public static void ausgeben(int lottozahlen[])
    		
Aufgabe 	     	
Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife die Lottozahlen wieder auf der Konsole aus.
Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.
	     	
Hinweis 	     	Sollten Sie mit der Scanner-Klasse arbeiten,
instanziieren Sie Ihren Scanner bitte ganz zu Beginn Ihrer Methode.
* Das Ausführen der Methode darf nicht zu einem Programmabsturz führen, wenn keine Zahlen übergeben werden.

# 16. GGT
  ### Schreiben Sie ein Programm mit folgenden Komponenten:
main-Methode*
Klassen-
bezeichnung 	     	GgT
		
Aufgabe 	         	1. Lesen Sie n für eine Anzahl von Arrayelementen ein.

2. Initialisieren Sie ein Array für n ganze, zufällige Zahlen im Wertebereich von 0 bis 100 (ausschließlich).
Nutzen Sie hierfür den Zufallszahlengenerator der Klasse Math.

3. Rufen Sie für jedes auf einander folgende Paar des Arrays (1. Element und 2. Element, 2. Element und 3. Element, 3. Element und 4. Element usw.) die Methode zum Berechnen des größten gemeinsamen Teilers auf.

4. Geben Sie jeweils das Paar und den größten gemeinsamen Teiler dabei aus.
Methode zum Berechnen des größten gemeinsamen Teilers
Methoden-
kopf 	     	public static int berechneGgt(int zahl1, int zahl2)
   		
Aufgabe 	     	
Berechnung des größten gemeinsamen Teilers von 2 Zahlen rekursiv oder iterativ.
(vgl. Algorithmus in den Folien der Vorlesung).
    		
Ausgabe-
format 		

Der ggt fuer X und Y lautet: Z

Der ggt fuer X und Y lautet: Z

Der ggt fuer X und Y lautet: Z


...

Weitere Hinweise
Hinweis 	     	Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und Methodennamen.
	     	
Hinweis 	     	Sollten Sie mit der Scanner-Klasse arbeiten,
instanziieren Sie Ihren Scanner bitte ganz zu Beginn Ihrer Methode.
* Das Ausführen der Methode darf nicht zu einem Programmabsturz führen, wenn keine Zahlen erzeugt werden (also die Eingabe "0" lautet).
