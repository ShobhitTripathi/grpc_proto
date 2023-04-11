package org.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: chat.proto")
public final class ChatServiceApiGrpc {

  private ChatServiceApiGrpc() {}

  public static final String SERVICE_NAME = "chat.ChatServiceApi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mmt.model.protobuf.chat.ChatService.Message,
      com.mmt.model.protobuf.chat.ChatService.Message> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.mmt.model.protobuf.chat.ChatService.Message.class,
      responseType = com.mmt.model.protobuf.chat.ChatService.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mmt.model.protobuf.chat.ChatService.Message,
      com.mmt.model.protobuf.chat.ChatService.Message> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.mmt.model.protobuf.chat.ChatService.Message, com.mmt.model.protobuf.chat.ChatService.Message> getSayHelloMethod;
    if ((getSayHelloMethod = ChatServiceApiGrpc.getSayHelloMethod) == null) {
      synchronized (ChatServiceApiGrpc.class) {
        if ((getSayHelloMethod = ChatServiceApiGrpc.getSayHelloMethod) == null) {
          ChatServiceApiGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<com.mmt.model.protobuf.chat.ChatService.Message, com.mmt.model.protobuf.chat.ChatService.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mmt.model.protobuf.chat.ChatService.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mmt.model.protobuf.chat.ChatService.Message.getDefaultInstance()))
              .setSchemaDescriptor(new ChatServiceApiMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatServiceApiStub newStub(io.grpc.Channel channel) {
    return new ChatServiceApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatServiceApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChatServiceApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChatServiceApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChatServiceApiFutureStub(channel);
  }

  /**
   */
  public static abstract class ChatServiceApiImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.mmt.model.protobuf.chat.ChatService.Message request,
        io.grpc.stub.StreamObserver<com.mmt.model.protobuf.chat.ChatService.Message> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mmt.model.protobuf.chat.ChatService.Message,
                com.mmt.model.protobuf.chat.ChatService.Message>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class ChatServiceApiStub extends io.grpc.stub.AbstractStub<ChatServiceApiStub> {
    private ChatServiceApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ChatServiceApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceApiStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.mmt.model.protobuf.chat.ChatService.Message request,
        io.grpc.stub.StreamObserver<com.mmt.model.protobuf.chat.ChatService.Message> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChatServiceApiBlockingStub extends io.grpc.stub.AbstractStub<ChatServiceApiBlockingStub> {
    private ChatServiceApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ChatServiceApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceApiBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.mmt.model.protobuf.chat.ChatService.Message sayHello(com.mmt.model.protobuf.chat.ChatService.Message request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChatServiceApiFutureStub extends io.grpc.stub.AbstractStub<ChatServiceApiFutureStub> {
    private ChatServiceApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ChatServiceApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceApiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mmt.model.protobuf.chat.ChatService.Message> sayHello(
        com.mmt.model.protobuf.chat.ChatService.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChatServiceApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChatServiceApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.mmt.model.protobuf.chat.ChatService.Message) request,
              (io.grpc.stub.StreamObserver<com.mmt.model.protobuf.chat.ChatService.Message>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChatServiceApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatServiceApiBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mmt.model.protobuf.chat.ChatService.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChatServiceApi");
    }
  }

  private static final class ChatServiceApiFileDescriptorSupplier
      extends ChatServiceApiBaseDescriptorSupplier {
    ChatServiceApiFileDescriptorSupplier() {}
  }

  private static final class ChatServiceApiMethodDescriptorSupplier
      extends ChatServiceApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChatServiceApiMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChatServiceApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatServiceApiFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
