import groovy.util.GroovyTestCase
import groovy.mock.interceptor.*

class BankAccountTests extends GroovyTestCase {

	private account

	def void setUp() {
		account = new BankAccount(10)
	}

	def void tearDown() {
		account = null
	}

	// Test Case - Pass
	def void testCanDepositMoney() {
		account.deposit(5)
		assert 15 == account.balance
	}

	/*
	// Test Case - Fail
	def void testCanDepositMoney() {
		def account = new BankAccount(10)
		account.deposit(5)
		assert 25 == account.balance
	}
	*/

	// Test Case - Withdraw Pass
	def void testCanWithdrawMoney() {
		account.withdraw(5)
		assert 5 == account.balance
	}

	/*
	def void testCanNotWithdrawMoreMoneyThanBalance() {
		shouldFail {
			account.withdraw(15)
		}
	}
	*/

	def void testCanNotWithdrawMoreMoneyThanBalance() {
		shouldFail(InsufficientFundsException) {
			account.withdraw(15)
		}
	}

	/*
	def void testCanAccrueInterest() {
		def service = new StubFor(InterestRateService)
		service.demand.getInterestRate {
			return 0.10
		}

		service.use {
			account.accrueInterest()

			// result = balance + (balance * interestRate)
			// 	   11 = 10 + (10 * 0.10)
			// 	   11 = 10 + 1
			//	   11 = 11
			assert 11 == account.balance
		}	
	}
	*/

	def void testCanAccrueInterest() {
		def service = new MockFor(InterestRateService)
		service.demand.getInterestRate {
			return 0.10
		}

		service.use {
			account.accrueInterest()

			// result = balance + (balance * interestRate)
			// 	   11 = 10 + (10 * 0.10)
			// 	   11 = 10 + 1
			//	   11 = 11
			assert 11 == account.balance
		}	
	}
}