package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class Product {

	private String id;
	private String name;
	private String type;
	private Date snapshotDate;
	private Money price;

	public Product(String id, String name, String type, Date snapshotDate, Money money) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.snapshotDate = snapshotDate;
		this.price = money;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getSnapshotDate() {
		return snapshotDate;
	}

	public void setSnapshotDate(Date snapshotDate) {
		this.snapshotDate = snapshotDate;
	}

	public Money getPrice() {
		return price;
	}

	public void setPrice(Money price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (id == null ? 0 : id.hashCode());
		result = prime * result + (name == null ? 0 : name.hashCode());
		result = prime * result + (type == null ? 0 : type.hashCode());
		result = prime * result + (snapshotDate == null ? 0 : snapshotDate.hashCode());
		result = prime * result + (price == null ? 0 : price.hashCode());
		return result;
	}

	@Override
	public  boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Product other = (Product) obj;


		if ( id == null) {
			if (other.id == null)
				return false;
		} else if(!id.equals(other.id))
			return false;

		if ( name == null) {
			if (other.name  == null)
				return false;
		} else if(!name.equals(other.name))
			return false;

		if ( type == null) {
			if (other.type == null)
				return false;
		} else if(!type.equals(other.type))
			return false;

		if ( snapshotDate == null) {
			if (other.snapshotDate == null)
				return false;
		} else if(!snapshotDate.equals(other.snapshotDate))
			return false;

		if ( price == null) {
			if (other.price == null)
				return false;
		} else if(!price.equals(other.price))
			return false;

		return true;
	}

	public boolean sameAs(Product other) {
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;

		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.sameAs(other.price))
			return false;

		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;

		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;

		return true;
	}
}
