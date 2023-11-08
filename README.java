# Ufms
class ContaCorrente:
    def _init_(self, primeiro_nome, sobrenome, numero_conta):
        self.juros = 0.01
        self.saldo = 0.0
        self.limiteChequeEspecial = -200.0
        self.primeiro_nome = primeiro_nome
        self.sobrenome = sobrenome
        self.numero_conta = numero_conta

    def deposito(self, valor):
        if valor > 0:
            self.saldo += valor

    def saque(self, valor):
        if valor <= (self.saldo + self.limiteChequeEspecial):
            self.saldo -= valor
        else:
            print("Limite insuficiente!")

    def rendimento(self):
        if self.saldo > 0:
            self.saldo += self.saldo * self.juros

    def exibir_saldo(self):
        return self.saldo

    def getNome(self):
        return f"{self.primeiro_nome} {self.sobrenome}"

    def getNumero(self):
        return self.numero_conta

if _name_ == "_main_":
    conta = ContaCorrente("John", "Doe", 123456)
    conta.deposito(100)
    conta.saque(125)
    conta.rendimento()
    print("Saldo:", conta.exibir_saldo())
