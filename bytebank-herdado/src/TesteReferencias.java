public class TesteReferencias {
    public static void main(String[] args) {

        Gerente geren1 = new Gerente();
        geren1.setNome("Marcos");
        geren1.setSalario(5000.0);

        EditorVideo edit = new EditorVideo();
        edit.setSalario(2500.0);

        Designer designer = new Designer();
        designer.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(geren1);
        controle.registra(edit);
        controle.registra(designer);

        System.out.println(controle.getSoma());


    }
}
