package GOF.Singelton;

import FileProcessor.Program;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First Log...");
        ProgramLogger.getProgramLogger().addLogInfo("Second Log...");
        ProgramLogger.getProgramLogger().addLogInfo("Third Log...");

        ProgramLogger.getProgramLogger().showLogFile();


    }
}
