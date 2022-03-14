# TableDeRoutage
  #1 La creation aléatoire d’un réseau réaliste
  
Il convient ici de creer la topologie d’interconnexion d’un réseau de 100 noeuds de la forme indiquée sur le 
schema figurant sur la page suivante. Les liens et les temps de communication sur chacun de ces liens vont
etre créees de manière aléatoire selon les règles suivantes : 
— le backbone ou coeur du reseau (Tier1 sur le schéma) composé de 10 noeuds très connectés entre 
eux par des lignes de communication a très haut débit. On va considérer que pour chaque lien 
possible entre ces sites (non oriente), il y a 75% de chance qu’il existe. Par ailleurs, si le lien existe,
il sera value par une valeur tirée aléatoirement entre 5 et 10 (représentant le temps unitaire moyen ´
de communication sur cette ligne).
— les operateurs de niveau 2 (Tier 2) souvent appelés opérateurs de transit. 20 noeuds qui seront
chacun connectes a 1 ou 2 noeuds du backbone tiré(s) aléatoirement et à 2 ou 3 noeuds de niveau 2
(tires également aléatoirement). Chacun de ces liens sera valué par une valeur comprise entre 10 et
20.
— les operateurs de niveau 3 (Tier3). 70 noeuds reliés chacun a 2 noeuds de niveau 2 et à 1 noeud de 
niveau 3. Les liens seront values par une valeur comprise entre 15 et 50.
##1
Il faudra egalement dans cette partie déterminer la structure de données qui vous parait la plus adéquate
pour representer et mémoriser le graphe correspondant à ce réseau. 
#2 La verification de la connexité du réseau 
Meme s’il est très probable que le réseau créé soit connexe, le tirage aléatoire des liens peut faire 
qu’exceptionnellement il ne le soit pas. Le but de cette partie est de developper une recherche en profondeur pour
verifier que tous les sommets peuvent bien etre atteints à partir d’un sommet de départ quelconque. Si ce
n’est pas le cas, il convient de relancer la creation d’un nouveau réseau.

#3 La determination de la table de routage de chaque noeud
La table de routage d’un noeud doit indiquer pour chaque destination possible (les 99 autres noeuds) à
quel voisin il convient de router un message (un paquet) compte tenu de la destination finale. C’est donc le
prochain noeud sur un plus court chemin vers cette destination car le message doit suivre le cheminement le
plus court en temps de communication (les temps de routage en chaque noeud intermediaire sont considérés
comme negligeables). Il convient donc dans cette partie de developper l’algorithme qui calcule ces 100
tables de routage.
#4 La reconstitution du chemin entre 2 noeuds
Il convient dans cette partie de permettre a l’utilisateur de saisir 2 noeuds : un noeud émetteur de message et
un noeud destinataire et a l’aide des tables de routage (il ne faut pas refaire ici le calcul de plus court chemin)
reconstituer le chemin que va suivre ce message. Ce chemin devra etre indiqué (affiché) à l’utilisateur. 
  
