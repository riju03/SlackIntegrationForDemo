import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;

public class SlackIntegrationTest {

    private static String webHookUrl = "https://hooks.slack.com/services/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";
    private static String oAuthToken = "xoxb-3906576084562-3899973152886-kqqUkY8HPU6fytLEUJdYWkxc";
    private static String channelName = "slack-bot-integration";



    public static void main(String args[]){
      sendMessageToSlack("My second message to slack");
    }

    public static void sendMessageToSlack(String message){
        try {
            StringBuilder msgBuilder = new StringBuilder();
            msgBuilder.append(message);

            //payload will have the data which we want to post to slack
            Payload payload = Payload.builder().channel(channelName).text(msgBuilder.toString()).build();

            // send messages to slack
            WebhookResponse wbResponse = Slack.getInstance().send(webHookUrl, payload);

        }catch(Exception e){
            e.printStackTrace();
        }



    }
}
