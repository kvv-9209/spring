package ru.gb.homework2;

public interface MessageRender {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
