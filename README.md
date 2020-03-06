# overview
spring bootでDIを試す

## 結果
色々

### annotation injectionする場合、interfaceを実装するクラスが2つあると？
起動エラーになる

### beanはシングルトンになる？ 
`@RestController`, `@Service`でDIコンテナに登録されるのは初期化時なので、シングルトンになる？

`org.springframework.context.annotation.Scope`で指定すれば、リクエスト毎にインスタンス化とかできる

```kotlin
import org.springframework.context.annotation.Scope

@Service
@Scope("request")
class BlogServiceImpl : BlogService{
    // ommit
}
```