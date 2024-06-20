package OrientadoObj;

public class Public_Private_Protect {
    // Atributo público: acessível de qualquer lugar
    public String publicAttribute;

    // Atributo privado: acessível apenas dentro desta classe
    private String privateAttribute;

    // Atributo protegido: acessível dentro do mesmo pacote e subclasses
    protected String protectedAttribute;

    // Construtor público: acessível de qualquer lugar
    public Public_Private_Protect(String publicAttribute, String privateAttribute, String protectedAttribute) {
        this.publicAttribute = publicAttribute;
        this.privateAttribute = privateAttribute;
        this.protectedAttribute = protectedAttribute;
    }

    // Método público: acessível de qualquer lugar
    public String getPublicAttribute() {
        return publicAttribute;
    }

    // Método privado: acessível apenas dentro desta classe
    private String getPrivateAttribute() {
        return privateAttribute;
    }

    // Método protegido: acessível dentro do mesmo pacote e subclasses
    protected String getProtectedAttribute() {
        return protectedAttribute;
    }

    // Método público para demonstrar o acesso ao atributo privado
    public String showPrivateAttribute() {
        return getPrivateAttribute();
    }

    public static void main(String[] args) {
        Public_Private_Protect example = new Public_Private_Protect("Public Value", "Private Value", "Protected Value");

        // Acessando o atributo público diretamente
        System.out.println("Public Attribute: " + example.publicAttribute);

        // Acessando o atributo protegido diretamente (possível porque estamos na mesma classe)
        System.out.println("Protected Attribute: " + example.protectedAttribute);

        // Acessando o atributo privado através de um método público
        System.out.println("Private Attribute: " + example.showPrivateAttribute());
    }
}

