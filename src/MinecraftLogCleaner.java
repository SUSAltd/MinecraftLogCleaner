import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MinecraftLogCleaner {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Minecraft Log Cleaner v. 0.0.0.0.0.0.0.0.0.0.1");
		System.out.println("Something to \"clean up\" Minecraft server logs" + 
				"for easier reading");
		System.out.println("For use with Minecraft 1.7.2 server logs ONLY");
		System.out.println();
		System.out.print("Filepath of the Minecraft server log: ");
		String filePath = console.nextLine();
		
		Scanner input = new Scanner(new File(filePath));
		
		System.out.println();
		System.out.println("================");
		System.out.println();
		
		String line = "";
		while (input.hasNextLine()) {
			line = input.nextLine();
			
			if (line.contains("[Server thread/INFO]: <") ||
					(line.contains("[Server thread/INFO]:") &&
							!line.substring(33).contains(":"))) {
				System.out.println(line.substring(0, 11) + line.substring(33));
			}
		}
	}

}
