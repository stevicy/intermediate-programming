import random
from probset2_package import moves
from probset2_package import determine_winner

def main_app():
    print("===== 'MMA Fighters RPSLS Game' =====")
    
    # Convert dictionary keys into a list
    options = list(moves.keys())

    while True:
            print("\n-----------------------------")
            print("Choices:")
            print("0 - Conor McGregor (Punch)")
            print("1 - Khabib Nurmagomedov (Takedown)")
            print("2 - Dustin Poirier (Kicks))")
            print("3 - Alex Pereira (Elbow)")
            print("4 - Jon Jones (Choke)")
            print("-----------------------------")

            try:
                print("\n-----------------------------")
                choice = int(input("Enter your choice (0-4): "))

                if choice < 0 or choice >= len(options):
                    print("Invalid choice! Try again.")
                    continue
            except ValueError:
                print("Please enter a integer number only.")
                continue

            player_choice = options[choice]            # Get player's move based on number selected. Example: if user enters 0 → options[0] = "Cardo"
            computer_choice = random.choice(options)   # The computer will choose randomly from the list of moves

            print(f"\nYou chose: {player_choice}")
            print(f"Computer chose: {computer_choice}")

            result = determine_winner(player_choice, computer_choice)
            print("\nResult: ", result)
            print("-----------------------------")

            again = input("\nPlay again? (yes/no): ").lower()
            if again != "yes":
                print("Thanks for playing!")
                break

#Run Program main_app
main_app()