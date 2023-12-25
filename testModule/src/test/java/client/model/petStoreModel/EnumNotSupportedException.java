package client.model.petStoreModel;

public class EnumNotSupportedException extends RuntimeException {
    public EnumNotSupportedException(Enum<?> enumMember) {
        super("Enum with type [" + enumMember.name() + "] not supported");
    }
}
