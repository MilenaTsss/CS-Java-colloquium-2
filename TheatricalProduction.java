public record TheatricalProduction(String name) implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void landVisitor() {
    }
}
