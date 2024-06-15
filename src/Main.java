import model.persistence.DatabaseConnection;
import view.guiLogin.LoginPanel;

public class Main {

	public static void main(String[] args) {
		DatabaseConnection dbConnection = new DatabaseConnection();
		dbConnection.connectAndExecute();

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LoginPanel tela = new LoginPanel();
				tela.setVisible(true);
			}
		});

	}
}
