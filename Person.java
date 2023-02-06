public record Person(String name) implements Visitor {

    @Override
    public void visit(Visitable visitable) {
        TheatricalProduction theatricalProduction = (TheatricalProduction) visitable;
        // do something
        theatricalProduction.landVisitor();
    }

}
