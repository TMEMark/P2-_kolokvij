# Upute za 2. kolokvij iz Programiranja 2

## 1. Preimenujte sve pakete prema uputama u kolokviju
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
## 3.1. Apstraktna klasa "Entitet"
Ima u sebi one atribute koje imaju sve druge klase i nasljeduju ga
@MappedSuperclass - anotacija za apstraktnu klasu koju nasljedujui sve druge klase
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) - anotacije za id koji je autoinkrement
## 3.2. Klase koje se mapiraju kao tablica u bazi
Imaju u sebi sve potrebne atribute i nasljeđuju apstraktnu klasu
@Entity - anotacija za klasu koja ce bit tablica u bazi
## 3.3 Spajanje klasa
### Jedan na prema više
@ManyToOne - za sve na prema jednom pr. @ManyToOne
    private Cura cura;
    
### Više na prema više
@ManyToMany - za vise na prema vise pr. @ManyToMany
    private List<Muskarac> muskarac;





