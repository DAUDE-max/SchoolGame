# SchoolGame
SchoolGame
Tag 1:
  Window erstellt, zu JFrame und JPanel eingelesen und as window angepasst.
  JPanel erstellt, versucht ein bild einzufügen;
  GamePanel erstellt und  JPanel idee verworfen.
  Das GamePanel als Herz des Systems.
  Größenkonstanten erstellt
  
  GameCore mit Thread erstellt
  updated und draw
 
Tag 2:
  MapClass angefangen - 2 Stunden planlos daran gearbeitet.
  MapClass gelöscht
  
  Quadrat erstellt welches der Player werden sollte
  KeyManager erstellt, der aus Tastenschläge reagert.
  Quadrat beweglich gemacht
  
Tag 3:
  Zu Images in JPanels eingelesen
  Quadrat und Steuerung gelöscht
  
  EntityCalss ertsellt von dem alle entitys erben sollten
  PlayerClass ertsellt, mit Position und Bufferd Image und draw() und update() ausgelagert.
  
meanwhile: 
  TileClass erstellt, einzeles Feld der Map
  TileManager erstellt, baut die Map zusammen
  (Map wird über die draw funktion manuell erstellt) !!Lösung!!
  
Tag 4:
  
  player movement Animiert über 2 abwechselnde Bilder
  
  zu BufferdReader eingelesen
  
  map wird jetzt über eine txt datei erstellt Prinzip:
  
  0 0 0 1 0 0 0
  0 0 0 1 0 0 0
  0 2 2 3 2 2 0
  0 2 4 4 4 2 0
  0 2 4 4 4 2 0
  0 2 4 4 4 2 0
  0 2 2 2 2 2 0
  0 0 0 0 0 0 0
  
  Für ein Haus(0 = erde; 1 = weg; 2 = Wand; 3 = Tür; 4 = Boden)
  
  !! Problem Kollision
  
Tag 5:
  Kamera erstellt und fast das gesamte Koordinaten handling überarbeitet.
  Tiles und Player Images designt
  

 