# NavigationComponent
It is a new Navigation technique to changing the frgments adding to backstack,passing data,making deeplinking etc.<br>

There are three main components of Navigation Component:<br>
1) Navigation graph(xml) :It is a summmary of all the fragment listed.(graph editor)<br>
2) NavHost(empty FragmentContainer):it is a container that contians all the frgament and as per the requirements we can replace,remove and add fragments.<br>
one Navhost have one NavController.<br>
3) NavController(Object kotlin/java Contoller class):It is a controller class that control the whole fragemet transcation.<br>

We can chnage the fragment with the use of Navigator based on:
1) id(Destination)
2) actions
3) Safe args plugin (Recommanded) Directions classes beacuse it is type safe and warn at the compile time.
