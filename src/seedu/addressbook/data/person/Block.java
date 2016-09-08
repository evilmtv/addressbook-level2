package seedu.addressbook.data.person;

public class Block {
    private String blockNumber_;

    public Block() {
    }

    public String getBlockNumber() {
        return blockNumber_;
    }

    public void setBlockNumber(String blockNumber) {
        blockNumber_ = blockNumber;
    }

    @Override
    public boolean equals(Object other) {
        return other == this || (other instanceof Block && this.blockNumber_.equals(((Block) other).blockNumber_));
    }
}