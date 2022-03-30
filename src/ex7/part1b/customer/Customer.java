package ex7.part1b.customer;

import ex7.part1b.MemberType;

public class Customer {
	private final String name;
	private MemberType memberType = MemberType.NONE;

	// The constructor is protected because only the factory should be able to access it
	protected Customer(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public MemberType getMemberType() {
		return memberType;
	}

	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}

	@Override
	public String toString() {
		return "Customer[name=%s,memberType=%s]".formatted(name, memberType);
	}
}
