from probset2_package import moves

def determine_winner(player_choice, computer_choice):
    p = moves[player_choice]  # player index
    c = moves[computer_choice] # computer index

    # If same choice → tie
    if p == c:
        return "It's a Tie!"
    
    #-----------------------------
    # Scissors(2) beats Paper(1)
    # Paper(1) beats Rock(0)
    # Rock(0) beats Lizard(3)
    # Lizard(3) beats Spock(4)
    # Spock(4) beats Scissors(2)
    # Scissors(2) beats Lizard(3)
    # Lizard(3) beats Paper(1)
    # Paper(1) beats Spock(4)
    # Spock(4) beats Rock(0)
    # Rock(0) beats Scissors(2)
    #-----------------------------

    # USER WIN CONDITIONS
    elif p == 2 and c == 1:
        return "Dustin Poirier kicks Khabib Nurmagomedov. You WIN!"
    elif p == 1 and c == 0:
        return "Khabib Nurmagomedov takes down Conor McGregor. You WIN!"
    elif p == 0 and c == 3:
        return "Conor McGregor punches Alex Pereira. You WIN!"
    elif p == 3 and c == 4:
        return "Alex Pereira elbows Jon Jones. You WIN!"
    elif p == 4 and c == 2:
        return "Jon Jones chokes Dustin Poirier. You WIN!"
    elif p == 2 and c == 3:
        return "Dustin Poirier kicks Alex Pereira. You WIN!"
    elif p == 3 and c == 1:
        return "Alex Pereira elbows Khabib Nurmagomedov. You WIN!"
    elif p == 1 and c == 4:
        return "Khabib Nurmagomedov takes down Jon Jones. You WIN!"
    elif p == 4 and c == 0:
        return "Jon Jones chokes Conor McGregor. You WIN!"
    elif p == 0 and c == 2:
        return "Conor McGregor punches Dustin Poirier. You WIN!"
    
    # COMPUTER WIN CONDITIONS (reversed)
    if c == 1 and p == 2:
        return  "Dustin Poirier kicks Khabib Nurmagomedov. Computer WIN"
    elif c == 1 and p == 0:
        return "Khabib Nurmagomedov takes down Conor McGregor. Computer WIN"
    elif c == 0 and p == 3:
        return "Conor McGregor punches Alex Pereira. Computer WIN"
    elif c == 3 and p == 4:
        return "Alex Pereira elbows Jon Jones. Computer WIN"
    elif c == 4 and p == 2:
        return "Jon Jones chokes Dustin Poirier. Computer WIN"
    elif c == 2 and p == 3:
        return  "Dustin Poirier kicks Alex Pereira. Computer WIN"
    elif c == 3 and p == 1:
        return "Alex Pereira elbows Khabib Nurmagomedov. Computer WIN"
    elif c == 1 and p == 4:
        return  "Khabib Nurmagomedov takes down Jon Jones. Computer WIN"
    elif c == 4 and p == 0:
        return "Jon Jones chokes Conor McGregor. Computer WIN"
    elif c == 0 and p == 2:
        return "Conor McGregor punches Dustin Poirier. Computer WIN"
    else:
        return "Unexpected result!"
    

    
