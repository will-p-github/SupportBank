package training.supportbank;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String args[]) throws IOException {

        FileHandler.readFile("DodgyTransactions2015.csv");
        UserInput.waitForInput();

    }

}
