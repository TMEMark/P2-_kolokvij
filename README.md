#Upute za 2. kolokvij iz Programiranja 2

Spajanje na bazu, izrada baze i mapiranje

create database [ime_baze] default character set utf8mb4;
grant all privileges on [ime_baze].* to 'p2'@'localhost' identified by 'julija';
<property name="connection.url">jdbc:mariadb://localhost/[ime_baze]?useSSL=false</property>
<mapping class="[klasa].[podklasa].[model]" />



Anotacije za modele

@MappedSuperclass - anotacija za apstraktnu klasu koju nasljedujui sve druge klase

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) - anotacije za id koji je autoinkrement

@Entity - anotacija za klasu koja ce bit tablica u bazi

@ManyToMany - za vise na prema vise pr. @ManyToMany
    private List<Muskarac> muskarac;

@ManyToOne - za sve na prema jednom pr. @ManyToOne
    private Cura cura;
