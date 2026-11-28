import random

class Moves:
    def __init__(self):
        self.moves = {
            "Conor McGregor (Punch)": 0,
            "Khabib Nurmagomedov (Takedown)": 1,
            "Dustin Poirier (Kicks)": 2,
            "Alex Pereira (Elbow)": 3,
            "Jon Jones (Choke)": 4
        }

    def get_move_by_index(self, index):
        return list(self.moves.keys())[index]

    def get_random_move(self):
        return random.choice(list(self.moves.keys()))


class WinnerSystem:
    def __init__(self, moves):
        self.moves = moves.moves

    def determine_winner(self, player_choice, computer_choice):
        p = self.moves[player_choice]
        c = self.moves[computer_choice]

        if p == c:
            return "It's a Tie!"

        # USER WIN
        if p==2 and c==1: return "Dustin Poirier kicks Khabib Nurmagomedov. You WIN!"
        if p==1 and c==0: return "Khabib Nurmagomedov takes down Conor McGregor. You WIN!"
        if p==0 and c==3: return "Conor McGregor punches Alex Pereira. You WIN!"
        if p==3 and c==4: return "Alex Pereira elbows Jon Jones. You WIN!"
        if p==4 and c==2: return "Jon Jones chokes Dustin Poirier. You WIN!"
        if p==2 and c==3: return "Dustin Poirier kicks Alex Pereira. You WIN!"
        if p==3 and c==1: return "Alex Pereira elbows Khabib Nurmagomedov. You WIN!"
        if p==1 and c==4: return "Khabib Nurmagomedov takes down Jon Jones. You WIN!"
        if p==4 and c==0: return "Jon Jones chokes Conor McGregor. You WIN!"
        if p==0 and c==2: return "Conor McGregor punches Dustin Poirier. You WIN!"

        # COMPUTER WIN
        if c==2 and p==1: return "Dustin Poirier kicks Khabib Nurmagomedov. Computer WIN"
        if c==1 and p==0: return "Khabib Nurmagomedov takes down Conor McGregor. Computer WIN"
        if c==0 and p==3: return "Conor McGregor punches Alex Pereira. Computer WIN"
        if c==3 and p==4: return "Alex Pereira elbows Jon Jones. Computer WIN"
        if c==4 and p==2: return "Jon Jones chokes Dustin Poirier. Computer WIN"
        if c==2 and p==3: return "Dustin Poirier kicks Alex Pereira. Computer WIN"
        if c==3 and p==1: return "Alex Pereira elbows Khabib Nurmagomedov. Computer WIN"
        if c==1 and p==4: return "Khabib Nurmagomedov takes down Jon Jones. Computer WIN"
        if c==4 and p==0: return "Jon Jones chokes Conor McGregor. Computer WIN"
        if c==0 and p==2: return "Conor McGregor punches Dustin Poirier. Computer WIN"

        return "Unexpected Result!"
