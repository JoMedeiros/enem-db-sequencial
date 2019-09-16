public class Main {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        DataBase dataBase = new DataBase();
        DataBaseLoader loader = new DataBaseLoader(dataBase);
        loader.run();
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Time to load file in milliseconds: " + elapsedTime);

        Result result = new Result();
        TUI.setDataBase(dataBase);
        TUI.setResult(result);
        TUI.setAnalyzer(new DataAnalyzer(dataBase, result));
        TUI.getINSTANCE().run();
    }
}
