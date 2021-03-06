package br.com.netodevel.springservicebusmock;

import com.microsoft.azure.servicebus.*;
import com.microsoft.azure.servicebus.primitives.ServiceBusException;

import java.time.Instant;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class QueueClientMock implements IQueueClient {

    @Override
    public ReceiveMode getReceiveMode() {
        return null;
    }

    @Override
    public String getQueueName() {
        return null;
    }

    @Override
    public void registerMessageHandler(IMessageHandler handler) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void registerMessageHandler(IMessageHandler handler, MessageHandlerOptions handlerOptions) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void registerSessionHandler(ISessionHandler handler) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void registerSessionHandler(ISessionHandler handler, SessionHandlerOptions handlerOptions) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void abandon(UUID lockToken) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void abandon(UUID lockToken, Map<String, Object> propertiesToModify) throws InterruptedException, ServiceBusException {

    }

    @Override
    public CompletableFuture<Void> abandonAsync(UUID lockToken) {
        return null;
    }

    @Override
    public CompletableFuture<Void> abandonAsync(UUID lockToken, Map<String, Object> propertiesToModify) {
        return null;
    }

    @Override
    public void complete(UUID lockToken) throws InterruptedException, ServiceBusException {

    }

    @Override
    public CompletableFuture<Void> completeAsync(UUID lockToken) {
        return null;
    }

    @Override
    public CompletableFuture<Void> deferAsync(UUID lockToken) {
        return null;
    }

    @Override
    public CompletableFuture<Void> deferAsync(UUID lockToken, Map<String, Object> propertiesToModify) {
        return null;
    }

    @Override
    public void deadLetter(UUID lockToken) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void deadLetter(UUID lockToken, Map<String, Object> propertiesToModify) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void deadLetter(UUID lockToken, String deadLetterReason, String deadLetterErrorDescription) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void deadLetter(UUID lockToken, String deadLetterReason, String deadLetterErrorDescription, Map<String, Object> propertiesToModify) throws InterruptedException, ServiceBusException {

    }

    @Override
    public CompletableFuture<Void> deadLetterAsync(UUID lockToken) {
        return null;
    }

    @Override
    public CompletableFuture<Void> deadLetterAsync(UUID lockToken, Map<String, Object> propertiesToModify) {
        return null;
    }

    @Override
    public CompletableFuture<Void> deadLetterAsync(UUID lockToken, String deadLetterReason, String deadLetterErrorDescription) {
        return null;
    }

    @Override
    public CompletableFuture<Void> deadLetterAsync(UUID lockToken, String deadLetterReason, String deadLetterErrorDescription, Map<String, Object> propertiesToModify) {
        return null;
    }

    @Override
    public int getPrefetchCount() {
        return 0;
    }

    @Override
    public void setPrefetchCount(int prefetchCount) throws ServiceBusException {

    }

    @Override
    public void send(IMessage message) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void sendBatch(Collection<? extends IMessage> messages) throws InterruptedException, ServiceBusException {

    }

    @Override
    public CompletableFuture<Void> sendAsync(IMessage message) {
        return null;
    }

    @Override
    public CompletableFuture<Void> sendBatchAsync(Collection<? extends IMessage> messages) {
        return null;
    }

    @Override
    public CompletableFuture<Long> scheduleMessageAsync(IMessage message, Instant scheduledEnqueueTimeUtc) {
        return null;
    }

    @Override
    public CompletableFuture<Void> cancelScheduledMessageAsync(long sequenceNumber) {
        return null;
    }

    @Override
    public long scheduleMessage(IMessage message, Instant scheduledEnqueueTimeUtc) throws InterruptedException, ServiceBusException {
        return 0;
    }

    @Override
    public void cancelScheduledMessage(long sequenceNumber) throws InterruptedException, ServiceBusException {

    }

    @Override
    public String getEntityPath() {
        return null;
    }

    @Override
    public CompletableFuture<Void> closeAsync() {
        return null;
    }

    @Override
    public void close() throws ServiceBusException {

    }
}
