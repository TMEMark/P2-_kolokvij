# Upute za 2. kolokvij iz Programiranja 2

## 1. Preuzmite hibernate s moodlea, raspakirajte u netbeans i preimenujte sve pakete prema uputama u kolokviju
## 2. Spajanje na bazu, izrada baze i mapiranje
### 2.1. Davanje ovlasti korisniku
Kroz CLI
Cd ..
Cd ..
Cd xampp
Cd bin
Ce mysql  -uroot
grant all privileges on [ime_baze].* to 'p2'@'localhost' identified by 'julija';
Bez CLI
grant all privileges on [ime_baze].* to 'p2'@'localhost' identified by 'julija';
### 2.2. Izrada baze
create database [ime_baze] default character set utf8mb4;
### 2.3. Konekcija na bazu u hibernate fileu
<property name="connection.url">jdbc:mariadb://localhost/[ime_baze]?useSSL=false</property>
### 2.4. Mapiranje modela
<mapping class="[klasa].[podklasa].[model]" />



## 3. Izrada modela
Za svaki model napraviti sve atribute navedene u kolokviju i generirati gettere i settere
### 3.1. Apstraktna klasa "Entitet"
Ima u sebi one atribute koje imaju sve druge klase i nasljeduju ga
@MappedSuperclass - anotacija za apstraktnu klasu koju nasljedujui sve druge klase
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) - anotacije za id koji je autoinkrement
## 3.2. Klase koje se mapiraju kao tablica u bazi
Imaju u sebi sve potrebne atribute i nasljeđuju apstraktnu klasu
@Entity - anotacija za klasu koja ce bit tablica u bazi
### 3.3 Spajanje klasa
#### Jedan na prema više
@ManyToOne - za sve na prema jednom pr. @ManyToOne
    private Cura cura;
    
#### Više na prema više
@ManyToMany - za vise na prema vise pr. @ManyToMany
    private List<Muskarac> muskarac;
## 4. Izrada kontrolera
### 4.1. Copy paste klasu Obrada.java
### 4.2. Izrada klasa koje nasljeđuju klasu obrada
    1. public class [naziv_klase] extends Obrada<[naziv_modela]>
    2. Klik na sijalicu  "implement all abstract methods i pobrisat sve u metodama"
    3. U metodu public List<[ime_modela]> read(){} dodati - return session.createQuery("from [ime_modela]").list();
    4. Izraditi metodu public void setPodaci(ulazni parametri){} - u fileu ObradaCura ima sve
## 5. View
### 5.1. Izrada Izbornika
    1. Izradiš Jframe Form Izbornik
    2. Source -> Obiriši psvm
    3. Code -> Generate Centar
    4. Start -> new Izbornik().setVisible(true);
    5. Properties -> title Izbornik
    6. Dodaj puceta koja vode na forme svih modela za CRUD
    6.1. Na svako puce u izborniku koje vodi na CRUD dodaj -> new NazivForme().setVisible(true);
    7. Dodaj dugmat prema uputama u zadatku i na svako puce edit text promijeni naziv prema uputama i onda promijeni naziv varijable "btnCura"
    8. Dodaj for petlju za insert u bazu na puce imas ju u file-u petlja
### 5.2. Izrada formi
    1. Izradiš Jframe Form Izbornik
    2. Source -> Obiriši psvm
    3. Code -> Generate Centar
    4. Start -> new Izbornik().setVisible(true);
    5. Properties -> title Izbornik
    6. Palette -> ListSelection
    6.1. Properties -> model pobriši sve
    6.2. Code -> type parameters promijeni u <> u naziv modela
    6.3. Na listu desni klik events 
    7. Dodaj puceta za update delete i create promijeni im nazive varijabli
    8. Dodaj txtField i labele promijeni nazive varijabli
    9. Napravi ViewAktivnosti kopiraj sve iz file-a na githubu koji se tak zove
    10. Dodaj kod iz filea KodZaSvakiKurac.java
    11. Dodaj ispod klase forme [NazivKontrolera] or;
    12. Dodaj u metodu FormaNaziv() npr or = new ObradaRiba();
    12. implements ViewAktivnosti mazni na klasu
    . U source za svako CUD puce dodaj kod
### 5.3. ViewAktivnosti komponente u Formama
    1. Ucitaj podatke - stavljas listu i combobox
    2. Postavi vrijednosti na view kontrole - Postavlja vrijednosti za svaki txt field i combo box
    3. Ucitaj vrijednosti iz view kontrola - 





