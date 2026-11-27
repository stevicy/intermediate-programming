class NumberExample:

    class InvalidError(Exception):
        pass

    def input_numbers(self):
        total = []
        number = 0

        while number < 5:
            try:
                user_input = input("\nEnter a number: ")
                n = int(user_input)
                total.append(n)
                number += 1

            except ValueError:
                try:
                    raise self.InvalidError("Invalid input. Only integers are allowed.")
                except self.InvalidError as e:
                    print(f"Caught Error: {e}")

        print(f"\nTotal sum of all number input: {sum(total)}")

run = NumberExample()
run.input_numbers()
