import random

# Personalized moves (MMA Version)
moves = {
    "Conor McGregor (Punch)": 0,            # Rock
    "Khabib Nurmagomedov (Takedown)": 1,    # Paper
    "Dustin Poirier (Kicks)": 2,            # Scissors
    "Alex Pereira (Elbow)": 3,              # Lizard
    "Jon Jones (Choke)": 4                  # Spock
}

# Determine winner
def determine_winner(player_choice, computer_choice):
    p = moves[player_choice]
    c = moves[computer_choice]

    if p == c:
        return "It's a Tie!"

    # USER WIN
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

    # COMPUTER WIN
    if c == 2 and p == 1:
        return "Dustin Poirier kicks Khabib Nurmagomedov. Computer WIN"
    elif c == 1 and p == 0:
        return "Khabib Nurmagomedov takes down Conor McGregor. Computer WIN"
    elif c == 0 and p == 3:
        return "Conor McGregor punches Alex Pereira. Computer WIN"
    elif c == 3 and p == 4:
        return "Alex Pereira elbows Jon Jones. Computer WIN"
    elif c == 4 and p == 2:
        return "Jon Jones chokes Dustin Poirier. Computer WIN"
    elif c == 2 and p == 3:
        return "Dustin Poirier kicks Alex Pereira. Computer WIN"
    elif c == 3 and p == 1:
        return "Alex Pereira elbows Khabib Nurmagomedov. Computer WIN"
    elif c == 1 and p == 4:
        return "Khabib Nurmagomedov takes down Jon Jones. Computer WIN"
    elif c == 4 and p == 0:
        return "Jon Jones chokes Conor McGregor. Computer WIN"
    elif c == 0 and p == 2:
        return "Conor McGregor punches Dustin Poirier. Computer WIN"

    return "Unexpected result!"


# MAIN PROGRAM
def main_app():
    print("===== 'MMA Fighters RPSLS Game' =====")

    user_wins = 0
    computer_wins = 0

    # My 2 files
    round_file = "file1_probset2.txt"
    overall_file = "file2_probset2.txt"

    # Open file1 for round results (append mode)
    results_file = open(round_file, "a")

    while True:
        # Display choices (simple)
        print("\n-----------------------------")
        print("Choices:")
        print("0 - Conor McGregor (Punch)")
        print("1 - Khabib Nurmagomedov (Takedown)")
        print("2 - Dustin Poirier (Kicks)")
        print("3 - Alex Pereira (Elbow)")
        print("4 - Jon Jones (Choke)")
        print("-----------------------------")

        # Get player choice
        try:
            choice = int(input("Enter your choice (0-4): "))
            if choice < 0 or choice > 4:
                print("Invalid choice! Try again.")
                continue
        except ValueError:
            print("Please enter a valid integer.")
            continue

        # Assign player's move
        if choice == 0:
            player_choice = "Conor McGregor (Punch)"
        elif choice == 1:
            player_choice = "Khabib Nurmagomedov (Takedown)"
        elif choice == 2:
            player_choice = "Dustin Poirier (Kicks)"
        elif choice == 3:
            player_choice = "Alex Pereira (Elbow)"
        elif choice == 4:
            player_choice = "Jon Jones (Choke)"

        # Computer move
        computer_choice = random.choice(list(moves.keys()))
        result = determine_winner(player_choice, computer_choice)

        # Show result
        print(f"\nYou chose: {player_choice}")
        print(f"Computer chose: {computer_choice}")
        print("Result:", result)

        with open(round_file, "a") as results_file:
            results_file.write(f"Player: {player_choice} | Computer: {computer_choice} | {result}\n")

        # Count wins
        if "You WIN" in result:
            user_wins += 1
        elif "Computer WIN" in result:
            computer_wins += 1

        again = input("\nPlay again? (yes/no): ").lower()
        if again != "yes":
            break

    results_file.close()  # always close file at the end

    # Determine overall winner
    if user_wins > computer_wins:
        overall = "OVERALL WINNER: PLAYER"
    elif computer_wins > user_wins:
        overall = "OVERALL WINNER: COMPUTER"
    else:
        overall = "OVERALL RESULT: TIE"

    # Save overall winner to file2
    with open(overall_file, "w") as f:
        f.write(overall)

    print("\nThanks for playing!")
    print(f"\nRound results saved to {round_file}")
    print(f"Overall result saved to {overall_file}")
   
# Run program
main_app()
