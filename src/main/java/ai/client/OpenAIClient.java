package ai.client;


public class OpenAIClient implements LLMClient{

    @Override
    public String msgReceiver(String prompt){
        return prompt;

    }
    
}
