## Spring Boot - concepts de base des POO Java
---
Dans ce repository, nous allons voir les concepts de base des POO en Java avec des exemples.

### Qu'est-ce que Programmation Orientée Objet en Java ?
---
La programmation orientée objet est un acronyme pour POO. La POO est une méthodologie de programmation 
qui considère un programme comme composé d'objets qui interagissent les uns avec les autres au moyen d'actions.
Le monde qui nous entoure est composé d'objets, tels que des personnes, des automobiles, des bâtiments, des rues, 
des machines à additionner, des papiers, etc. Chacun de ces objets a la capacité d'effectuer certaines actions, 
et chacune de ces actions a un effet sur certains des autres objets.<br/>

**Voici les principales caractéristiques de la programmation orientée objet**
* **Encapsulation** : L'encapsulation est un processus de liaison des données (variable d'instance) et des méthodes en une seule unité. Exemple en rendant la variable d'instance privée et en fournissant la méthode getter et setter correspondante (c'est-à-dire les conventions de nommage JavaBeans). 
*L'avantage de l'encapsulation : La possibilité d'apporter des modifications à votre code sans casser le code des autres utilisateurs de votre code est un grand avantage de l'encapsulation.*
* **Polymorphisme** : Le polymorphisme signifie plus d'une forme. lorsqu'une forme (c'est-à-dire les méthodes et la variable de référence) se comporte différemment dans différents cas, on l'appelle polymorphisme. Il existe deux types de polymorphisme.
	1. Polymorphisme au moment de la compilation – appelé liaison statique. Il est réalisé à l'aide de la méthode Overloading.
	2. Polymorphisme d'exécution - appelé liaison dynamique. Il est obtenu à l'aide de la substitution de méthode.
* **Héritage** : L'héritage est l'un des concepts de POO par lesquels une classe acquiert toutes les propriétés des autres classes (c'est-à-dire la super classe). Héritage obtenu par le mot-clé extend. C'est la réutilisation du code.
* **Abstraction** : L'abstraction est le processus de dissimulation des détails internes. Il permet aux utilisateurs de gérer et d'utiliser différentes applications sans se soucier de la manière dont il a été mis en œuvre en interne.
En Java, nous pouvons réaliser l'abstraction de deux manières :
	1. En rendant les cours abstraits.
	2. En utilisant l'interface.

**Quelques points liés à la classe abstraite**
* Nous pouvons déclarer n'importe quelle classe abstraite à l'aide de mots-clés abstract.
* La classe abstraite ne peut pas être instanciée, seule une référence peut être créée.
* Une classe abstraite peut contenir aussi bien une méthode abstraite qu'une méthode non abstraite.

**Quelques points liés à l'interface**
* Une interface est un contrat pour ce qu'une classe peut faire, ils ne disent rien sur la manière dont la classe doit le faire.
* Une classe peut implémenter une ou plusieurs interfaces.
* Une interface ne peut pas implémenter une autre interface.
* Une interface peut étendre une ou plusieurs interfaces.
* Une interface ne peut avoir qu'une méthode abstraite, c'est-à-dire que les méthodes par défaut de l'interface sont « résumé public ».
* Si une classe implémente une interface, cette classe doit remplacer toutes les méthodes de l'interface.