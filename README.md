# Projet de sirraWEb
* [Dépôt central](https://github.com/pierrelucueisd/Demo-INF5001) sur GitHub
* [Demo](https://inf5001-demo.herokuapp.com/) et 
[Documentation des API](https://inf5001-demo.herokuapp.com/swagger-ui.html) sur Heroku.
## Description
Logiciel de gestion d'employés pour une entreprise de formation. Elle comprend un module 
 de générer des horaires de façon semi-automatisée.

## Installation
#### Dépendances: 
##### Prérequises:
* Java
* Maven
* Base de donnée posgresql ex: [pgAdmin](https://www.pgadmin.org/download/)
##### Ajoutés par le programmes:
* Angular
* Npm
#### Configuration des accès à la base de donnée: 
Votre base de donnée doit avoir:
 * un `nomBaseDeDonnee` ex: sirraDB
 * un `nomUtilisateur` ayant accès aux droits sur la base de donnée  ex: sirraUser
 * un `motDePasse` de l'utilisateur en question ex: sirraMB2745
 
Vous devez créer une variable locale ``JDBC_DATABASE_URL``
dont la valeur est au format: 
``jdbc:postgresql://127.0.0.1:5432/[nomBaseDeDonnee]?user=[nomUtilisateur]&password=[motDePasse]`` 
(remplacer les crochets par la valeur correspondante de votre installation)

Pour se faire vous pouriez avoir le choix d'utiliser une commande semblable en ligne de commande windows (cmd):
```
setx JDBC_DATABASE_URL "jdbc:postgresql://127.0.0.1:5432/sirraDB?user=sirraUser&password=sirraMB2745"
```
Lorsque la variable a été ajouté avec succès, vous devez fermer votre session windows et la réouvrir.
Si vous ne faites pas cette étape, le programme Sirra pourrait ne pas pouvoir détecter la base de données et
ne pourra donc pas s'intaller avec succès.

#### Commandes d'installation du programme: 
Se construit avec maven en employant les comandes suivantes à la racine:
```
mvn clean
mvn package
```
Certains ide permettent d'installer sans que l'utilisateur voit l'utilisation de ces commandes.

##communauté
### Tutoriels
<a href="https://www.youtube.com/playlist?list=PLGN2Dvm8fzLdt1HE0D9ajoTfsN_DwecXf" alt="Nos tutoriels" target="_blank">
<img src="https://i.imgur.com/vKb2F1B.png" />
</a>

## Technologies
* springBoot
* sringboot starter
* Springboot data JPA
* Java
* angular

## exemple d'IDE
* [IntelliJ](https://www.jetbrains.com/fr-fr/idea/) pour le backend et l'application root
* [Visual Studio Code](https://code.visualstudio.com/) pour le frontend
* [Git for Windows](https://gitforwindows.org/) pour certaines opérations

## Version
1.0.0

## License 

Le projet est sous licence MIT X11.

Consulter le fichier [LICENSE.md](LICENSE.md) pour les détails de la licence.

