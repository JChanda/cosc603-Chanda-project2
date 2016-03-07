package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class Cell.
 */
public abstract class Cell implements iOwnable {
	
	/** The available. */
	private boolean available = true;
	
	/** The name. */
	private String name;
	
	/** The theOwner. */
	protected Player theOwner;

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.iOwnable#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.iOwnable#getTheOwner()
	 */
	@Override
	public Player getTheOwner() {
		return theOwner;
	}
	
	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.iOwnable#getPrice()
	 */
	@Override
	public int getPrice() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.iOwnable#isAvailable()
	 */
	@Override
	public boolean isAvailable() {
		return available;
	}
	
	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.iOwnable#playAction()
	 */
	@Override
	public abstract void playAction();

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.iOwnable#setAvailable(boolean)
	 */
	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.iOwnable#setTheOwner(edu.towson.cis.cosc603.project2.monopoly.Player)
	 */
	@Override
	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    /* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.iOwnable#toString()
	 */
    @Override
	public String toString() {
        return name;
    }
}
