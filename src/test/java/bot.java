
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;




public class bot extends TelegramLongPollingBot {

    static long chatId2;
    boolean propusk = false;


    @Override
    public void onUpdateReceived(Update update) {



        long chatId = update.getMessage().getChatId();
        String text = update.getMessage().getText();
        System.out.println(text);

        if(update.hasMessage() && update.getMessage().hasText()) {

            if ("/start".equals(text)) {

                sendReplyKeyboard(chatId, "Выберите специальность: ", "1ИС..","1БС..","1МНЭ..","1МЭ..","1РЭ..","1ЭБ..");

            }else if ("1ИС..".equals(text)) {

                sendReplyKeyboard(chatId, "Выберите группу: ", "1ИС10","1ИС21","1ИС22","1ИС30","1ИС30п","Назад");
                propusk = true;

            }else if ("1БС..".equals(text)) {

                sendReplyKeyboard(chatId, "Выберите группу: ", "1БС01","1БС02","1БС11","1БС12","1БС20","1БС30","Назад");
                propusk = true;
            }else if ("1МНЭ..".equals(text)) {

                sendReplyKeyboard(chatId, "Выберите группу: ", "1МНЭ01","1МНЭ02","1МНЭ11","1МНЭ12","1МНЭ20","1МНЭ20п","1МНЭ30","1МНЭ30п","Назад");
                propusk = true;
            }else if ("1МЭ..".equals(text)) {

                sendReplyKeyboard(chatId, "Выберите группу: ", "1МЭ01","1МЭ02","1МЭ30","Назад");
                propusk = true;
            }else if ("1РЭ..".equals(text)) {

                sendReplyKeyboard(chatId, "Выберите группу: ", "1РЭ01","1РЭ02","1РЭ11","1РЭ12","1РЭ13","1РЭ21","1РЭ22","1РЭ23","1РЭ30п","1РЭ31","1РЭ32","Назад");
                propusk = true;
            }else if ("1ЭБ..".equals(text)) {

                sendReplyKeyboard(chatId, "Выберите группу: ", "1ЭБ10","1ЭБ20","1ЭБ30","Назад");
                propusk = true;
            }
            else if ("1ЭБ..".equals(text)) {

                sendReplyKeyboard(chatId, "Выберите группу: ", "1ЭБ10","1ЭБ20","1ЭБ30","Назад");
                propusk = true;
            }else if ("Назад".equals(text)) {
                sendReplyKeyboard(chatId, "Выберите специальность: ", "1ИС..","1БС..","1МНЭ..","1МЭ..","1РЭ..","1ЭБ..");
                propusk = false;
            }
            else if (propusk) {
                 Site site = new Site();
                 site.enterGroup(text);
                 sendTextMessage(chatId, "Расписание для "+text);
                 sendTextMessage(chatId, site.generalInfo());
                 site.quit();

            } else {
                propusk = false;
                sendReplyKeyboard(chatId, "Привет!", "/start");
                if(propusk){
                    sendReplyKeyboard(chatId, "Выберите специальность: ", "1ИС..","1БС..","1МНЭ..","1МЭ..","1РЭ..","1ЭБ..");
                }
            }
        }
    }

    void sendReplyKeyboard(long chatId, String text, String... buttonLabel1) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);

        KeyboardRow row = new KeyboardRow();
        List<KeyboardRow> keyboard = new ArrayList<>();
        for (String buttonLabel : buttonLabel1) {
            KeyboardButton button = new KeyboardButton(buttonLabel);
            row.add(button);
        }
        keyboard.add(row);
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup(keyboard);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendTextMessage(long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "SeniorPomidorio_bot";
    }
    @Override
    public String getBotToken() {
        return "6868633543:AAHPM6iMplt_HdL2-ieWxAFqm0uUMfGhIvA";
    }
}
