package ru.gb.homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class ConsoleMessageRenderer implements MessageRender {

   // private MessageProvider messageProvider;

    @Override
    public void render() {
        //System.out.println(messageProvider.getMessage());
        getMessageProvider().getMessage();
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider provider) {
       // this.messageProvider = provider;
    }

    @Override
    @Lookup
    public MessageProvider getMessageProvider() {
        return null;
        //return this.messageProvider;
    }
}
