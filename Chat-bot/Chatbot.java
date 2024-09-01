import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chatbot {

    private static Map<String, String> responses;

    public static void main(String[] args) {
        initializeResponses();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I am your chatbot. Ask me anything or type 'exit' to end the conversation.");
        
        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();
            
            if (input.equals("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }
            
            String response = getResponse(input);
            System.out.println("Chatbot: " + response);
        }
        
        scanner.close();
    }

    private static void initializeResponses() {
        responses = new HashMap<>();
        responses.put("hello", "Hello! How can I assist you today?");
        responses.put("how are you", "I'm just a bunch of code, but I'm here to help!");
        responses.put("what is your name", "I am a chatbot created to assist you with your queries.");
        responses.put("what can you do", "I can answer simple questions. Try asking me something!");
        responses.put("tell me a joke", "Why don't programmers like nature? It has too many bugs.");
        responses.put("thank you", "You're welcome!");
        responses.put("goodbye", "Goodbye! Have a great day!");
    }

    private static String getResponse(String input) {
        for (String key : responses.keySet()) {
            if (input.contains(key)) {
                return responses.get(key);
            }
        }
        return "I'm sorry, I don't understand that.";
    }
}

