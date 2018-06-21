# Wiz4rdGame

PROBLEMS & SOLUTIONS:
#1 - Problem: When Movement Keys (W, S, A, D) are continuously pressed then released, the player (Wizard) does not move but 
pauses for a while before respond again to keyPressed, sometimes does not even respond at all and User would have to turn off 
game and restart game again.
#1 - Attempted Solutions: A) Changing the code but that was just a little tedious especially having to change many things from 
many different Objects B) Connecting the device to another keyboard, but the problem still occurred C) Contemplating giving
up and cry in a corner after hours and hours of research, JK! /////
Functional Solution: Apparently, when keys are continuously pressed on MacOS (High Sierra), an Accent Menu bar would pop up.
Thus, preventing the User from producing let's say "eeeeeeeeee" for example when the key "e" is pressed continuously. All that
was needed to be done was to DISABLE the keyboard from displaying the Accent Menu when a key is continuously pressed. DISABLE by
opening APPLICATIONS then open UTILITIES then open TERMINAL then input "defaults write -g ApplePressAndHoldEnabled -bool false"
into TERMINAL then click enter. Lastly, restart device and have fun!
