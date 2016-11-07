public class Maincontroller {
	public static void main(String args[]) {

		Database data = new Database();
		data.movieListCreation();

		Controller user = new Controller();
		user.userInterface();

	}

}
