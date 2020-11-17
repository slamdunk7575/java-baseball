package domain;

public class PlayerBallNumber {
    private BaseBallNumbers playerBaseBallNumber;

    public PlayerBallNumber(BaseBallNumberGenerator basisNumberGenerator) {
        this.playerBaseBallNumber = new BaseBallNumbers(basisNumberGenerator);
    }

    public BaseBallNumbers getBallNumbers() {
        return playerBaseBallNumber;
    }
}
