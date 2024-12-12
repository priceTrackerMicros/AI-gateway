package com.priceAlert.ms.AI_gateway;

import com.priceAlert.ms.AI_gateway.client.Gpt4FreeClient;
import com.priceAlert.ms.AI_gateway.domain.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class AiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiGatewayApplication.class, args);

		Gpt4FreeClient gpt4FreeClient = new Gpt4FreeClient();

		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();

		ArrayList<ChatCompletionMessage> chatCompletionMessages = new ArrayList<>();

		ChatCompletionMessage chatCompletionMessage = new ChatCompletionMessage(ChatCompletionRole.USER,
						"Si detectas que en la conversación se te pasa un texto en lenguaje natural para " +
										"crear una alerta sobre un producto online, quiero que extraigas los atributos URL" +
										" y targetPrice y los mandes como body de una peticiones POST a " +
										"http://129.151.196.101/createAlert. De momento no hagas el curl, solo pasame la " +
										"peticion en formato curl. El formato de targetPrice ha de ser x.y, donde 'x' es " +
										"euros e '\\''y'\\'' céntimos. Estos dos atributos en formato JSON, en plano " +
										"(no metas markdown ni saltos de linea, el json limpio)");

		chatCompletionMessages.add(chatCompletionMessage);

		chatCompletionMessage = new ChatCompletionMessage(ChatCompletionRole.ASSISTANT,
						"vale");

		chatCompletionMessages.add(chatCompletionMessage);

		chatCompletionMessage = new ChatCompletionMessage(ChatCompletionRole.USER,
						"hola, me interesa rastrear el producto " +
										"https://www.amazon.es/Cecotec-Power-Espresso-20-Inoxidable/dp/B0763N7WMP/ref=sr_1_5?dib=eyJ2IjoiMSJ9.H2pbijbLDWU_Y2opABjW-isH1ZphtcKQvmz3N_3LOvxPevVCODmE_M5SftSibLtjqcjEL6YwnHR8ksmQ4JhsXtmCzLEFJIBesCtViFYCgGYFXNw7EGP63cE_W_l-XlRFYDPpxGWZv8ft9hwrqBcIMEjzuguraOmrCORcb9yRQ4Xam7ZQ0DysU2rfVututvROlLZgHRLhNG9rSpGklmUPZ2deHEnWuSDTOc0mrb8JWkL5XwWtvqAFlECPTzzBjmPQHgI-yah8Xr_oWMLpMJHABkIFEZgytWpuhjVXc86b1-NHt9AvkaJd_T5XQJCen_Qiy4W_z_U2Wv4ws6sTFX_UqsLwKvNxFG42s1Ba8fPVCMt0GYVw2ZOhPFLtexdeJxAL5zJ9TxVpdPo9CXdwSweANL8BOiYn15E1w3myGuDKMG1l7RQEhIUDZTaZoiZALr4k.q202IeTA2_Fkd_BSse7OuIrjNgQCLTo5AYZ3UZKvUf8&dib_tag=se&keywords=cafetera&nsdOptOutParam=true&qid=1733847671&sr=8-5" +
										", y que me avisaras cuando su precio baje de diez euros y medio");

		chatCompletionMessages.add(chatCompletionMessage);

		chatCompletionMessage = new ChatCompletionMessage(ChatCompletionRole.ASSISTANT,
						"vale");

		chatCompletionMessages.add(chatCompletionMessage);

		chatCompletionRequest.setMessages(chatCompletionMessages);
		chatCompletionRequest.setChatCompletionProvider(ChatCompletionProvider.ChatGptEs);
		chatCompletionRequest.setChatCompletionModel(ChatCompletionModel.Gpt4o);
		chatCompletionRequest.setStream(false);
		chatCompletionRequest.setWebSearch(true);
		chatCompletionRequest.setHistoryDisabled(false);
		chatCompletionRequest.setAutoContinue(true);
		chatCompletionRequest.setTimeout(0);

		gpt4FreeClient.chatCompletion(chatCompletionRequest);
	}

}
