from one import func


print("Top level in two.py")

func()


if __name__ == "__main__":
    print("two.py is being run directly")
else:
    print("two.py has been imported")
