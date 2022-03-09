package assessment;

	import java.io.File;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Scanner;
	import java.util.stream.Collectors;
	import java.util.stream.IntStream;

	public class virtual_key
	{

		 static class MainMenuOptions {

				public static void welcomeScreen() {
					
					System.out.println("Welcome to virtual Key which is Developed by Narenra \n");

					System.out.println("You can Retrieve all File Names, Search Files, Add Files, or Delete Files\n");
				}

				public static void displayMenu() {
					String menu = "\nSelect \n"
							+ "1 to Retrieve all files inside folder\n"
							+ "2 to Display menu for File operations\n" + "3 to Exit program\n";
					System.out.println(menu);

				}

				public static void FileMenu() {
					String fileMenu = "\nSelect \n"
							+ "1 to Add a file\n"
							+ "2 to Delete a file\n"
							+ "3 to Search for a file\n" + "4 to Show Main Menu\n";

					System.out.println(fileMenu);
				}

			}
			public static void createFile(String folderName) {
				File file = new File(folderName);

				if (!file.exists()) {
					file.mkdirs();
				}
			}

			public static void viewFiles(String path) {
				virtual_key.createFile("Phase1/Hello");

				List<String> filesListNames = virtual_key.allfiles(path, 0, new ArrayList<String>());

				System.out.println("Displaying All Files In Ascending Order\n");

				filesListNames.stream().forEach(System.out::println);
			}

			private static List<String> allfiles(String path, int i, ArrayList<String> arrayList) {
				// TODO Auto-generated method stub
				File dir = new File(path);
				File[] files = dir.listFiles();
				List<File> filesList = Arrays.asList(files);

				
				if (files != null && files.length > 0) {
					for (File file : filesList) {
						arrayList.add(file.getName());
					}
				}

				return arrayList;

			}

			public static void createFile(String fileToAdd, Scanner sc) {
				virtual_key.createFile("Phase1/Hello");
				Path pathToFile = Paths.get("./Phase1/Hello/" + fileToAdd);
				try {
					Files.createDirectories(pathToFile.getParent());
					Files.createFile(pathToFile);
					System.out.println(fileToAdd + "File Is created successfully");

					System.out.println("Would you like to add some content? Press Y to yes and N to no");
					String choice = sc.next().toLowerCase();

					sc.nextLine();
					if (choice.equals("y")) {
						System.out.println("\n\nInput content and press enter\n");
						String content = sc.nextLine();
						Files.write(pathToFile, content.getBytes());
						System.out.println("\nContent written to file " + fileToAdd);
						
					}

				} catch (IOException e) {
					System.out.println("Failed to Create File " + fileToAdd);
					System.out.println(e.getClass().getName());
				}
			}

			public static List<String> displayFile(String fileName, String path) {
				List<String> fileListNames = new ArrayList<>();
				virtual_key.searchFile(path, fileName, fileListNames);

				if (fileListNames.isEmpty()) {
					System.out.println("\n We Could  Not Find Any File With  The Given File Name \"" + fileName + "\"\n");
				} else {
					System.out.println("\n Your File is Found Found :");

					List<String> files = IntStream.range(0, fileListNames.size())
							.mapToObj(index -> (index + 1) + ": " + fileListNames.get(index)).collect(Collectors.toList());

					files.forEach(System.out::println);
				}

				return fileListNames;
			}

			public static void searchFile(String path, String fileName, List<String> fileListNames) {
				File dir = new File(path);
				File[] files = dir.listFiles();
				List<File> filesList = Arrays.asList(files);

				if (files != null && files.length > 0) {
					for (File file : filesList) {

						if (file.getName().startsWith(fileName)) {
							fileListNames.add(file.getAbsolutePath());
						}

						if (file.isDirectory()) {
							searchFile(file.getAbsolutePath(), fileName, fileListNames);
						}
					}
				}
			}

			public static void deleteFile(String path) {

				File currFile = new File(path);
				File[] files = currFile.listFiles();

				if (files != null && files.length > 0) {
					for (File file : files) {

						String fileName = file.getName() + " at " + file.getParent();
						if (file.isDirectory()) {
							deleteFile(file.getAbsolutePath());
						}

						if (file.delete()) {
							System.out.println(fileName + " File Was Deleted Successfully");
						} else {
							System.out.println("Failed To Delete Your File " + fileName);
						}
					}
				}

				String currFileName = currFile.getName() + " at " + currFile.getParent();
				if (currFile.delete()) {
					System.out.println(currFileName + " As You Given Current File Was Deleted successfully");
				} else {
					System.out.println("As You Given Current File  Is Failed To Delete " + currFileName);
				}
			}

			

			static class HandleOptions {
				public static void WelcomeScreen() {
					boolean running = true;
					Scanner sc = new Scanner(System.in);
					do {
						try {
							MainMenuOptions.displayMenu();
							int input = sc.nextInt();

							switch (input) {
							case 1:
								virtual_key.viewFiles("Phase1 projects/Hello");
								break;
							case 2:
								HandleOptions.fileMenu();
								break;
							case 3:
								System.out.println("Program exited thank you.");
								running = false;
								sc.close();
								System.exit(0);
								break;
							default:
								System.out.println("Please Select a Valid Option From The Above Menu: ");
							}
						} catch (Exception e) {
							System.out.println(e.getClass().getName());
							WelcomeScreen();
						}
					} while (running == true);
				}

				public static void fileMenu() {
					boolean running = true;
					Scanner sc = new Scanner(System.in);
					do {
						try {
							MainMenuOptions.FileMenu();
							virtual_key.createFile("Phase1 projects/Hello");

							int input = sc.nextInt();
							switch (input) {
							case 1:
								System.out.println("Enter The  FileNmae Which Has To Be Added ");
								String fileToAdd = sc.next();

								virtual_key.createFile(fileToAdd, sc);

								break;
							case 2:
								// File/Folder delete
								System.out.println("Enter the name of the file to be deleted");
								String fileToDelete = sc.next();

								virtual_key.createFile("Phase1 projects/Hello");
								List<String> filesToDelete = virtual_key.displayFile(fileToDelete,
										"Phase1 projects/Hello");

								String deletionPrompt = "\nSelect Index of Which File To Delete?"
										+ "\nEnter 0 If You Want To Delete ";
								System.out.println(deletionPrompt);

								int i = sc.nextInt();

								if (i != 0) {
									virtual_key.deleteFile(filesToDelete.get(i - 1));
								} else {

									for (String path : filesToDelete) {
										virtual_key.deleteFile(path);
									}
								}

								break;
							case 3:
								
								System.out.println(
										"Enter the name of the file to be searched from \"Phase1 projects/Hello\" folder");
								String fileName = sc.next();

								virtual_key.createFile("Phase1 projects/Hello");
								virtual_key.displayFile(fileName, "Phase1 projects/Hello");

								break;
							case 4:
								
								return;
							
							default:
								System.out.println("Please Select a Valid Option From Above Menu : ");
							}
						} catch (Exception e) {
							System.out.println(e.getClass().getName());
							fileMenu();
						}
					} while (running == true);
				}
			}


	}

