package principles.solid_two.singleResponsibility;

public class PositionRepairer {

    public Position fix(Position position) {

        return new Position(
                position.getxAxis()<0?0:position.getxAxis(),
                position.getyAxis()<0?0:position.getyAxis()
        );
    }

}
