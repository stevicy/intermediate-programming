from Sim1_Probset1_OOP import Moves, WinnerSystem

move_system = Moves()
winner_system = WinnerSystem(move_system)

user_wins = 0
computer_wins = 0

print("===== 'MMA Fighters RPSLS Game' (OOP Version) =====")

while True:
    print("\n-----------------------------")
    print("Choices:")
    print("0 - Conor McGregor (Punch)")
    print("1 - Khabib Nurmagomedov (Takedown)")
    print("2 - Dustin Poirier (Kicks)")
    print("3 - Alex Pereira (Elbow)")
    print("4 - Jon Jones (Choke)")
    print("-----------------------------")

    try:
        choice = int(input("Enter your choice (0-4): "))
        if choice < 0 or choice > 4:
            print("Invalid choice! Try again.")
            continue
    except ValueError:
        print("Please enter a valid integer!")
        continue

    player_choice = move_system.get_move_by_index(choice)
    computer_choice = move_system.get_random_move()

    result = winner_system.determine_winner(player_choice, computer_choice)

    print(f"\nYou chose: {player_choice}")
    print(f"Computer chose: {computer_choice}")
    print("Result:", result)

    if "You WIN" in result:
        user_wins += 1
    elif "Computer WIN" in result:
        computer_wins += 1

    again = input("\nPlay again? (yes/no): ").lower()
    if again != "yes":
        break

print("\n===== FINAL RESULT =====")
if user_wins > computer_wins:
    print("OVERALL WINNER: PLAYER")
elif computer_wins > user_wins:
    print("OVERALL WINNER: COMPUTER")
else:
    print("OVERALL RESULT: TIE")

print("\nThanks for playing!")
