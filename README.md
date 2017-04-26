WarDut le jeu de cartes médiéval fantastique des IUTs infos.

# Le principe du TP

Avec toute la classe en binôme vous allez coder un jeu de carte avec une interface console.
Pour commencer demandez l'accès au dépôt git : https://git-iut.univ-lille1.fr/thomas.clavier/wardut-n2p2-g
puis le cloner.
Travaillez en binôme sur un seul PC en TDD. 

Pour mémoire les étapes du TDD sont les suivantes :

* Écrire un test et vérifier qu'il est rouge
* Commit
* Faire l'implémentation pour faire passer le test au vert
* Commit et push
* Restructurer le code pour qu'il soit simple (KISS et YAGNI) bien structuré (DRY) et lisible
* Commit et push
* etc.

Tout le travail à réaliser se trouve dans le fichier TODO.md.Pour prendre une tâche et indiquez au reste de la classe que vous avez pris cette tâche, modifiez le fichier pour déplacer la tâche dans la section "En cours". Une fois la tâche terminée ne pas oublier de modifier à nouveau ce fichier pour déplacer la tâche dans la section "Fini".

# Le principe du jeu

* chaque joueurs a 5 cartes en main et 20 cartes en réserve
* à chaque tour chacun pose une carte 
* tire une nouvelle carte au hasard dans sa réserve 
* puis on calcule la bataille
* une fois que plus personne n'a de carte en main, on compte 1 point par unité vivante. Celui qui gagne, est celui qui a le plus de points.

Ordre des destructions :
- Château fort
- Géant
- loup
- Fantassin
- chevalier
- archer
- catapulte
- mage

# Cartes

## Géant

unité immédiatement présente sur le champ de bataille
attaque : 5
résistance : 50
chance de présence : 5 

## Loup

unité immédiatement présente sur le champ de bataille
attaque : 3
résistance : 3
chance de présence : 20

## Fantassin

Attaque simple au corps à corps à pied : 3 tours avant d'arriver sur le champ de bataille attaque et déffense.
attaque : 10
résistance : 10
chance de présence : 40

## Chevalier

Attaque rapide à cheval : immédiatement sur le champ de bataille
attaque : 15
résistance : 15
chance de présence : 10

## Archer

Attaque simple à distance : 1 tour avant d'attaquer le champ de bataille
attaque : 5
résistance : 5
chance de présence : 30

## Catapulte

4 tours avant d'arriver sur le champ de bataille
attaque : 20
résistance : 20
chance de présence : 5

## Mage

gerrisseurs, dernier sur le champ de bataille, permet d'activer des sorts
attaque : 0
résistance : 5
chance de présence : 20

## Sapeur

n'attaque qu'une fois et que les chateaux forts
attaque : 200
résistance : 0
chance de présence : 5

## Chateau fort

Si cette carte est posé toutes les unités sont protégés, mais il n'y a que les archets qui peuvent attaquer.
Cette est carte a une durée de vie de 3 tours
attaque : 0
résistance : 500
chance de présence : 10

## Guérison

Cette carte ne peut être posé que si un mage est présent, permet de faire gagner 5 points de vie à toutes les unités vivante (fantassin, archer, chevalier, mage, géant)
Carte valable 3 tours
chance de présence : 5

## Bouclier

Cette carte ne peut être posé que si un mage est présent, permet de faire gagner 5 points de résistance à toutes les unités
Carte valable 3 tours
chance de présence : 5

## Feux du dragon

Cette carte ne peut être posé que si un mage est présent, permet de faire perdre 3 points de résistance à toutes les unités adverce
carte valable 2 tours
chance de présence : 5

## Envoutement des loups

Cette carte ne peut être posé qye si un mage est présent, permet de rajouter 7 points d'attaque à tous les loups 
Carte valable 3 tours
chance de présence : 5

## Armement magique

Cette carte ne peut être posé que si un mage est présent, permet de faire gagner 3 points d'attaque à toutes les unités sauf les loups et les géants.
Carte valable 3 tours
chance de présence : 5

